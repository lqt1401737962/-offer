package day04_Map接口;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

//四、往一个Map集合中添加若干元素。获取Map中的所有value，并使用增强for和迭代器遍历输出每个value。
public class Test04_Map接口中的方法 {
    public static void main(String[] args) {
        //1创建HashMap
        HashMap<String, String> hm = new HashMap<>();
        //添加元素
        hm.put("黄晓明", "Baby");
        hm.put("邓超", "孙俪");
        hm.put("李晨", "范冰冰");
        hm.put("大黑牛", "范冰冰");
        //使用values获取值
        Collection<String> values = hm.values();
        //用Iterator 遍历
        Iterator<String> i = values.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println("_______________________________");
        //使用增强for
        for (String value : values) {
            System.out.println(value);
        }

    }
}
