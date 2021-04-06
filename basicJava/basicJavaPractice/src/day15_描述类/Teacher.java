package day15_描述类;
//属性：姓名name，年龄age，讲课内容content

public class Teacher {
    private String name;
    private int age;
    private String content;

    public Teacher() {
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Teacher(String name, int age, String content) {
        this.name = name;
        this.age = age;
        this.content = content;
    }
    //成员方法：吃饭eat方法，讲课teach方法
    public void eat(){
        System.out.println("讲着课吃着饭");
    }
    public  void teach(){
        System.out.println("吃着饭讲着课");
    }
}
