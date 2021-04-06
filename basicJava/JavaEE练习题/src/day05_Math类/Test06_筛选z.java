package day05_Math类;

import java.util.ArrayList;

/*
    筛选字符串。
        定义ArrayList集合，存入多个字符串。
        长度大于5的字符串，打印删除后的集合。
 */
public class Test06_筛选z {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("士大夫撒");
        al.add("发送");
        al.add("fgdfsg");
        al.add("就是his速度");
        al.add("就是his 是的冯绍峰速度");
        al.add("就是his速十多个度");
        ArrayList<String> al2 = new ArrayList<>();
        for (int i = 0; i < al.size(); i++) {
            String s = al.get(i);
            if (s.length() > 5) {
                al2.add(s);
            }
        }
        System.out.println(al2);
    }
}
