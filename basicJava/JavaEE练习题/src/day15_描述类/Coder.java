package day15_描述类;

/*
Coder类：
    属性：姓名，工号，薪资
    构造方法：无参构造方法，满参构造方法
    成员方法：
    get/set方法
    intro方法：打印姓名，工号信息
    showSalary方法：打印薪资信息
    work方法：打印工作信息
 */
public class Coder {
    private String name;
    private String num;
    private double money;

    public Coder() {
    }

    public Coder(String name, String num, double money) {
        this.name = name;
        this.num = num;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    //intro方法：打印姓名，工号信息
    //    showSalary方法：打印薪资信息
    //    work方法：打印工作信息
    public void intro() {
        System.out.println("姓名:" + name + ",工号:" + num);
    }

    public void showSalary() {
        System.out.println("薪资是;" + money);
    }

    public void work() {
        System.out.println("我天天累死累活的工作");
    }
}
