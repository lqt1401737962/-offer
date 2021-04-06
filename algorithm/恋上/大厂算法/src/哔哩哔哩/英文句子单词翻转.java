package 哔哩哔哩;

import java.util.Scanner;

/**https://www.nowcoder.com/question/next?pid=20725618&qid=643418&tid=35868163
 * @author Qitong!!
 * @Date 2020/8/12
 */
public class 英文句子单词翻转 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(reverseWords(input));
    }
    public static String reverseWords(String s){
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
    private static void reverseWord(char[] chars,int l, int r) {
        r--;
        while (l < r){
            char temp = chars[l];
            chars[l] = chars[r];
            chars[r] = temp;
            l++;r--;
        }
    }

}
