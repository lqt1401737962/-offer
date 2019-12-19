package day05_Math类;

//替换某字符串中的某字符串。
    //键盘录入一个srcStr字符串，再录入一个delStr字符串。
    //删除该字srcStr符串中的所有delStr字符串。
public class Test04_需求实现3 {
    public static void main(String[] args) {
        alter("heimanihao wodshiheima","heima");
    }
    public static void alter(String src,String del){
        String replace = src.replace(del, "");
        System.out.println(replace);
        }
    }

