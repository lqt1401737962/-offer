package day16_内部类.Test02模拟上课出勤情况;

import java.util.ArrayList;

/*
    模拟上课出勤情况。
    定义学生类：

    属性：姓名，出勤。
    提供基本的构造方法和get方法，set方法。
    定义讲师类：

    属性：姓名。
    提供基本的构造方法和get方法，set方法
    成员方法：点名方法，设置每一位的学生出勤情况。假设，小明今日未出勤。
    定义课程类：

    属性：课程名称，讲师，学生集合。
    提供基本的构造方法和get方法，set方法
    成员方法：show方法，打印课程信息，老师姓名，学生是否上课情况。
 */
public class 上课情况 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("迪丽热巴",true));
        students.add(new Student("古力娜扎",true));
        students.add(new Student("马尔扎哈",false));
        Course course = new Course("语文","刘骐通",students);
        course.show();
    }
}
