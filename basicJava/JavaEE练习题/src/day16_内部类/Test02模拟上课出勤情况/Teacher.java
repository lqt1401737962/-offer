package day16_内部类.Test02模拟上课出勤情况;

import java.util.ArrayList;

/*
定义讲师类：

    属性：姓名。
    提供基本的构造方法和get方法，set方法
    。
 */
public class Teacher {
    private String name;

    public Teacher() {
    }

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //成员方法：点名方法，设置每一位的学生出勤情况。假设，小明今日未出勤
    public void dianMing(ArrayList<Student> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            Student student = arrayList.get(i);
            if (!student.getName().equals("小明")) {
                student.setCq(true);
            }
        }
    }
}
