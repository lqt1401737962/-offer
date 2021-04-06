package day15_描述类;

/*
老师类Teacher

属性：姓名name，年龄age，讲课内容content
成员方法：吃饭eat方法，讲课teach方法
学生类Student

属性：姓名name，年龄age，学习内容content 行为：吃饭eat方法，	学习study方法
 */
public class Test06_学生老师 {
    public static void main(String[] args) {
        Student 迪丽热巴 = new Student("迪丽热巴", 18);
        Teacher 马尔扎哈 = new Teacher("马尔扎哈", 88, "java");
        迪丽热巴.eat();
        迪丽热巴.study();
        马尔扎哈.eat();
        马尔扎哈.teach();
    }
}
