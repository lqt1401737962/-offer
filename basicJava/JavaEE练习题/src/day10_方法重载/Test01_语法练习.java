package day10_方法重载;


/*
语法点：方法定义，方法重载
    编写步骤：


        main方法中,调用printNum方法,传入a,b
 */
public class Test01_语法练习 {
    public static void main(String[] args) {
        //定义类 Test1,类中定义 main方法,定义int类型a为10, b为10.
        int a = 10, b = 10;
        printNum(a, b);//main方法中,调用printNum方法,传入a,b
        doubling(a, b);//main方法中,调用doubling方法,传入a,b
        a = doubling(a);//main方法中,调用doubling方法,传入a,用a接收返回值
        b = doubling(b);//main方法中,调用doubling方法,传入b,用b接收返回值
        printNum(a, b);

    }

    //定义printNum方法,参数为(int iVar, int iVar2),返回值无,输出iVar和iVar2的值
    private static void printNum(int iVar, int iVar2) {
        System.out.println(iVar);
        System.out.println(iVar2);
    }

    //定义doubling方法,参数为(int r, int p),
    // 返回值无,方法内r翻倍,p翻倍,并调用printNum方法,输出r和p的值
    private static void doubling(int r, int p) {
        r *= 2;
        p *= 2;
        printNum(r, p);
    }

    //定义doubling方法,参数为(int r),返回值int, 方法内r翻倍,返回r.
    private static int doubling(int r) {
        r *= 2;
        return r;
    }

}
