package day13_继承和抽象类;

/*
    定义Student类，继承Person
    属性：分数
    构造方法：无参构造方法，有参构造方法
    成员方法：getXxx方法，setXxx方法，考试方法
 */
public class Student extends Person {
    private String score;

    public Student() {
    }

    public Student(String name, int age, String score) {
        super(name, age);
        this.score = score;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public void exam() {
        System.out.println("我迅速做完了我的试卷");
    }
}
