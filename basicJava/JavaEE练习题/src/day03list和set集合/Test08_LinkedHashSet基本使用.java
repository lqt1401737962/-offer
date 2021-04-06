package day03list和set集合;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;

//八、使用LinkedHashSet存储以下元素："王昭君","王昭君","西施","杨玉环","貂蝉"。
//                                  使用迭代器和增强for循环遍历LinkedHashSet。
public class Test08_LinkedHashSet基本使用 {
    public static void main(String[] args) {
        LinkedHashSet<String> lhSet = new LinkedHashSet<>();
        // 2.使用add方法添加元素到LinkedHashSet
        lhSet.add("王昭君");
        lhSet.add("王昭君");
        lhSet.add("王昭君");
        lhSet.add("西施");
        lhSet.add("杨玉环");
        lhSet.add("貂蝉");

        //迭代器遍历集合
        Iterator<String> iterator = lhSet.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s);
        }
        System.out.println("________________");
        //foreach遍历集合
        for (String s : lhSet) {
            System.out.println(s);
        }

    }
}
