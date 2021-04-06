package day15_描述类;

/*
定义两个类，经理类Manager，程序员类Coder

定义测试类，创建Manager对象，创建Coder对象，并测试。
 */
public class Test05_员工 {
    public static void main(String[] args) {
        Manager 刘骐通 = new Manager("刘骐通", "181254353L", 18345.4);
        Coder 陈艺霏 = new Coder("陈艺霏", "33888383838", 23.22);
        刘骐通.intro();
        刘骐通.showSalary();
        刘骐通.work();
        陈艺霏.intro();
        陈艺霏.showSalary();
        陈艺霏.work();
    }
}
