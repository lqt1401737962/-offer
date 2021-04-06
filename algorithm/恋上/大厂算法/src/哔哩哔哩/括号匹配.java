package 哔哩哔哩;

import java.util.HashMap;
import java.util.Stack;

/**
 * @author Qitong!!
 * @Date 2020/8/13
 */
public class 括号匹配 {
    private static HashMap<Character, Character> map = new HashMap<>();
    static {
        // key - value
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');
    }

    public boolean IsValidExp(String s) {
        Stack<Character> stack = new Stack<>();

        int len = s.length();
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            // 左括号
            if (map.containsKey(c)) {
                stack.push(c);
            } else { // 右括号
                if (stack.isEmpty()) return false;

                if (c != map.get(stack.pop())) return false;
            }
        }
        return stack.isEmpty();
    }
}
