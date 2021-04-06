package day03list和set集合;

import java.util.ArrayList;
import java.util.List;

//七、向list集合添加姓名{张三,李四,王五,二丫,钱六,孙七},将二丫替换为王小丫。
public class Test07_List集合元素替换 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        //2.存入数据
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("二丫");
        list.add("钱六");
        list.add("孙七");
        //替换 二丫  被替换  王小丫
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if ("二丫".equals(s)){
                list.set(i,"王小丫");
            }
        }
        System.out.println(list);

    }
}
