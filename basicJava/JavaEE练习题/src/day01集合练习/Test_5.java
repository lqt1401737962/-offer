package day01集合练习;

import java.util.ArrayList;

/*
练习五：Collection集合contains()方法使用
        五、定义一个方法listTest(ArrayList<String> al, String s),
            要求使用contains()方法判断al集合里面是否包含s。
 */
public class Test_5 {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<String>();
        a1.add("ss");
        a1.add("s");
        a1.add("sdf");
        a1.add("无234");
        boolean b = listTest(a1, "ss");
        System.out.println(b);
    }

    /*
    返回值:boolean
    参数列表:ArrayList<String> al, String s
    名称:listTest
     */
    public static boolean listTest(ArrayList<String> al, String s) {
        if (al.contains(s)) {
            return true;
        }
        return false;
    }
}
