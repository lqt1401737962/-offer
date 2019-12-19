package day03list和set集合;

import java.util.ArrayList;
import java.util.Collections;

//九、ArrayList集合中有如下内容： {33,11,77,55}，
//                              使用Collections.sort()对ArrayList集合中的数据进行排序，
//                              并打印出排序后的结果。
public class Test09_Collections工具类使用 {
    public static void main(String[] args) {
        // 1.创建ArrayList
        ArrayList<Integer> arr = new ArrayList<Integer>();

        // 2.使用add方法添加{33,11,77,55}四个元素
        arr.add(33);
        arr.add(11);
        arr.add(77);
        arr.add(55);
        System.out.println(arr);
        //用ArrayList进行排列
        Collections.sort(arr);
        System.out.println(arr);
    }
}
