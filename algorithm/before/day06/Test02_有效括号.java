package day06;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Test02_有效括号 {
    public static void main(String[] args) {
        boolean v = isValid("(){[()]}");
        System.out.println(v);
    }

    private static final HashMap<Character, Character> map = new HashMap<Character, Character>() {{
        put('(', ')');
        put('[', ']');
        put('{', '}');
        put('?', '?');
    }};

    public static boolean isValid(String s) {
        if (s.length() > 0 && s.length() % 2 == 1 && map.containsKey(s.charAt(0))) {
            return false;
        }
        LinkedList<Character> stack = new LinkedList<Character>() {{
            add('?');
        }};
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) stack.addLast(c);
            else if (map.get(stack.removeLast()) != c) return false;
        }
        return stack.size() == 1;
    }

}
