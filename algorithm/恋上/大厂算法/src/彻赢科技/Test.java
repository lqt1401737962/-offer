package 彻赢科技;

import java.util.ArrayList;

/**
 * @author Qitong!!
 * @Date 2020/8/7
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<Person> heaps = new ArrayList<>();
        while (true){
            heaps.add(new Person());
        }
    }
}
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
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
}
