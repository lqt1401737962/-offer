package DFS;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number/
 * @author Qitong!!
 * @Date 2020/6/18
 */
public class _17_电话号码的字母组合2 {
    private char[][] lettersArray = {
            {'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'},
            {'j', 'k', 'l'}, {'m', 'n', 'o'}, {'p', 'q', 'r', 's'},
            {'t', 'u', 'v'}, {'w', 'x', 'y', 'z'}
    };


    public List<String> letterCombinations(String digits) {
        if (digits == null) return null;
        char[] chars = digits.toCharArray();
        List<String> list = new ArrayList<>();
        if (chars.length == 0) return list;
        char[] string = new char[chars.length];
        dfs(0,string,list,chars);
        return list;
    }

    private void dfs(int index,char[] string,List<String> list,char[] chars) {
        //如果进入到最后一层!
        if(index == chars.length){
            //就会得到一个正确的解
            list.add(new String(string));
            return;
        }
        //枚举这层所有的可能
        char[] letters = lettersArray[chars[index] - '2'];
        for (char letter : letters){
            string[index] = letter;
            dfs(index+1,string,list,chars);
        }
    }
}
