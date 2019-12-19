package day05_Math类;
/*
    字符串查找。
        键盘录入一个大字符串，再录入一个小字符串。
        统计小字符串在大字符串中出现的次数。
 */
public class Test03_小字符串大字符串数 {
    public static void main(String[] args) {
        String s1="xiaoqiqiwoaininishibushishaaqiqi";
        String s2="qiqi";
        int count = count(s1, s2);
        System.out.println(count);
    }
    public static int count(String big,String small){
        int  index=0;
        int count =0;
        while ((index = big.indexOf(small, index)) != -1) {
            index++;
            count++;
        }
        return count;
    }
}
