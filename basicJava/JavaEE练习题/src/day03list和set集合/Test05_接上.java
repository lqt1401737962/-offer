package day03list和set集合;



import java.util.LinkedList;

//2）特有方法：addFirst, addLast, getFirst, getLast, removeFirst, removeLast, push, pop, clear等方法。
public class Test05_接上 {
    public static void main(String[] args) {
        LinkedList<String> linked = new LinkedList<>();
        linked.add("周杰伦");
        linked.add("周星驰");
        linked.add("周华健");
        linked.add("周润发");
        //用addFirst
        linked.addFirst("骐通");
        //addLast
        linked.addLast("七七");
        System.out.println(linked);
        //getFirst
        String first = linked.getFirst();
        System.out.println(first);
        //getLast
        String last = linked.getLast();
        System.out.println(last);
        System.out.println("___________________");
        //removeFirst    removeLast
        linked.removeFirst();
        linked.removeLast();
        System.out.println(linked);
        System.out.println("___________________");
        linked.push("最爱迪丽热巴");
        System.out.println(linked);
        System.out.println("_________________");
        String pop = linked.pop();
        System.out.println(pop + "pop是");
        System.out.println("__________________");
        linked.clear();
        System.out.println(linked);

    }
}
