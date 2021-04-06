package day13_继承和抽象类;

/*
定义Person类。
    属性：姓名、年龄
    构造方法：无参构造方法，有参构造方法
    成员方法：getXxx方法，setXxx方法，显示基本信息showMsg方法
 */
public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void showMsg() {
        System.out.println("姓名:" + this.name + "年龄" + this.age);
    }
}
