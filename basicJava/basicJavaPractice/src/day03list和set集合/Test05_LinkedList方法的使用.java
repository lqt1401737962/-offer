package day03list和set集合;

import javax.sound.midi.Soundbank;
import java.util.LinkedList;

/*
五、根据要求练习LinkedList方法：
（1）基本方法：add, set, get, remove, clear, size等方法；
（2）特有方法：addFirst, addLast, getFirst, getLast, removeFirst, removeLast, push, pop, clear等方法。

 */
public class Test05_LinkedList方法的使用 {
    public static void main(String[] args) {
        //创建likedList集合
        LinkedList<String> strings = new LinkedList<>();
        //基本方法
        strings.add("刘骐通");
        strings.add("陈艺霏");
        strings.add("迪丽热巴");
        strings.add("古力娜扎");
        strings.add("马尔扎哈");
        System.out.println(strings);
        System.out.println("strings的元素个数是:"+strings.size());
        System.out.println("_____________");
        strings.set(1,"我老婆");
        System.out.println(strings);
        System.out.println("____________________");
        String s = strings.get(0);
        System.out.println(s);
        System.out.println("_______________-");
        strings.remove(1);
        System.out.println(strings);
        System.out.println("________________________");
        strings.clear();
        System.out.println(strings);




    }
}
