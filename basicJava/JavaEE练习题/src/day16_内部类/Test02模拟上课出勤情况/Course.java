package day16_内部类.Test02模拟上课出勤情况;

import java.util.ArrayList;

/*
定义课程类：

    属性：课程名称，讲师，学生集合。
    提供基本的构造方法和get方法，set方法

 */
public class Course {
    private String subject;
    private String teachPer;
    private ArrayList<Student> arrayList;

    public Course() {
    }

    public Course(String subject, String teachPer, ArrayList<Student> arrayList) {
        this.subject = subject;
        this.teachPer = teachPer;
        this.arrayList = arrayList;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTeachPer() {
        return teachPer;
    }

    public void setTeachPer(String teachPer) {
        this.teachPer = teachPer;
    }

    public ArrayList<Student> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<Student> arrayList) {
        this.arrayList = arrayList;
    }

    //成员方法：show方法，打印课程信息，老师姓名，学生是否上课情况。
    public void show() {
        System.out.println("课程名称:" + subject);
        System.out.println("授课老师:" + teachPer);
        for (int i = 0; i < arrayList.size(); i++) {
            Student student = arrayList.get(i);
            if (student.isCq()) {
                System.out.println("上课:" + student.getName());
            } else {
                System.out.println("旷课:" + student.getName());
            }
        }
    }
}
