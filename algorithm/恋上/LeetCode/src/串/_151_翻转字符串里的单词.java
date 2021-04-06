package 串;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *https://leetcode-cn.com/problems/reverse-words-in-a-string/
 * @author  Qitong!!
 * @Date 2020/6/13
 */
public class _151_翻转字符串里的单词 {
    /**
     * @Author Qitong~
     * @Description //TODO 输入: "  hello world!  "
     *                      输出: "world! hello"
     *                      解释: 输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。
     *                      实例2:
     *                      输入: "a good   example"
     *                      输出: "example good a"
     *                      解释: 如果两个单词间有多余的空格，将反转后单词间的空格减少到只含一个。
     * @Date 20:18 2020/6/13
     * @Param [s]
     * @return java.lang.String
     **/
    //自己实现方法!!1
    public String reverseWords3(String s){
        if (s == null ) return "";

        char[] chars = s.toCharArray();
        //存放字符串的实际长度!
        int len = 0 ;
        //存放当前准备存放 元素的位置
        int cur = 0;
        boolean flag = true;      //前一个字符是否为空格
        for (int i = 0; i <chars.length; i++) {
            if (chars[i] != ' '){
                chars[cur++] = chars[i];
                flag = false;
            }else if ( flag == false){
                chars[cur++] = ' ';
                flag = true;
            }
        }
        len = flag? --cur: cur;
        if (len <= 0) return "";

        reverseWord(chars,0,len);
        int preIndex = -1;
        for (int i = 0; i < len; i++) {
            if (chars[i] == ' '){
                reverseWord(chars,preIndex+1,i);
                preIndex = i;
            }
        }
        reverseWord(chars,preIndex +1 ,len);

        return new String(chars,0,len);
    }

    private void reverseWord(char[] chars,int l, int r) {
        r--;
        while (l < r){
            char temp = chars[l];
            chars[l] = chars[r];
            chars[r] = temp;
            l++;r--;
        }
    }

    //略微优于1
    public String reverseWords2(String s) {
        if(s == null) return "";

        String s1 = s.trim();
        List<String> strings = Arrays.asList(s1.split("\\s+" ));
        Collections.reverse(strings);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strings.size(); i++) {
            if (i == strings.size() -1) {sb.append(strings.get(i));}
            else{sb.append(strings.get(i)).append(" ");}
        }
        return sb.toString();

    }

    //用jdk官方方法!!
    public String reverseWords(String s) {

        // 除去开头和末尾的空白字符
        s = s.trim();
        // 正则匹配连续的空白字符作为分隔符分割
        List<String> wordList = Arrays.asList(s.split("\\s+"));
        Collections.reverse(wordList);
        return String.join(" ", wordList);
    }
}
