package day15_描述类;
//属性：姓名name，年龄age，学习内容content 行为：吃饭eat方法，	学习study方法
public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
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
    public void eat(){
        System.out.println("学啥啥不会吃饭第一名");
    }
    public  void study (){
        System.out.println("我爱学习,学习不爱我");
    }
}
