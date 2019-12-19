package day13_继承和抽象类;
/*
定义Teacher类，继承Person
    属性：学科
    构造方法：无参构造方法，有参构造方法
    成员方法：getXxx方法，setXxx方法，讲课方法
 */
public class Teacher extends Person {
    private  String subject;

    public Teacher() {
    }

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    public void teachLesson(){
        System.out.println("老师闭着眼讲课");
    }
}
