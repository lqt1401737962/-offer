package day13_继承和抽象类;
/*
模拟教学管理系统师生信息。

 */
public class Test04_教师管理系统 {
    public static void main(String[] args) {
        Student 张三 = new Student("张三", 19, "88.88");
        张三.exam();
        张三.showMsg();
        Teacher 老刘 = new Teacher("老刘", 18, "Java");
        老刘.teachLesson();
        老刘.showMsg();

    }
}
