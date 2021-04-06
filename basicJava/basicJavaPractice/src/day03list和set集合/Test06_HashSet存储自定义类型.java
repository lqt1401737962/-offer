package day03list和set集合;

import java.util.HashSet;

/*
六、定义人类，包含姓名和年龄属性。创建4个人存储到HashSet中，姓名和年龄相同的人看做同一人不存储。
 */
public class Test06_HashSet存储自定义类型 {
    public static void main(String[] args) {
        HashSet<Person> people = new HashSet<>();
        people.add(new Person("迪丽热巴",18));
        people.add(new Person("古力娜扎",18));
        people.add(new Person("马尔扎哈",20));
        people.add(new Person("迪丽热巴",18));
        System.out.println(people);
    }
}
