package day16_内部类.Test01;

import day16_内部类.Test01.HandleAble;

/*
定义HandleAble接口，具备一个处理字符串数字的抽象方法方法HandleString（String num）。
    处理方式1：取整数部分。
    处理方式2：保留指定位小数，四舍五入。
    代码实现，效果如图所示：
    开发提示：
    匿名内部类的方式，调用所有抽象方法。
 */
public class Test01_需求实现 {
    public static void main(String[] args) {
        String s1="1234.2144";
        HandleAble h1 = new HandleAble() {
            @Override
            public String HandleString(String num) {
                return s1.substring(0,s1.indexOf("."));
            }
        };
        String string = h1.HandleString(s1);
        System.out.println(string);
        HandleAble h2 = new HandleAble() {
            @Override
            public String HandleString(String num) {
                int a =(int) (Double.parseDouble(num)+0.5);
                String s = string.valueOf(a);
                return s;
            }
        };
        String s2 = h2.HandleString("234.5");
        System.out.println(s2);
    }
}
