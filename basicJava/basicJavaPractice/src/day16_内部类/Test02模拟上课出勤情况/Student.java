package day16_内部类.Test02模拟上课出勤情况;
/*
定义学生类：

    属性：姓名，出勤。
    提供基本的构造方法和get方法，set方法。
 */
public class Student {
    private String name;
    private boolean cq;

    public Student() {
    }

    public Student(String name, boolean cq) {
        this.name = name;
        this.cq = cq;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCq() {
        return cq;
    }

    public void setCq(boolean cq) {
        this.cq = cq;
    }
}
