package day04_Map接口;

import java.util.HashMap;

//三、请使用Map集合的方法完成添加元素，根据键删除，以及根据键获取值操作
public class Test03_Map接口中的常用方法 {
    public static void main(String[] args) {
        //创建Map
        HashMap<String, String> hm = new HashMap<String, String>();
        // 2.使用put添加元素
        hm.put("黄晓明", "Baby");
        hm.put("邓超", "孙俪");
        hm.put("李晨", "范冰冰");
        hm.put("大黑牛", "范冰冰");
        System.out.println(hm);
        //修改put
        String s = hm.put("李晨", "白百何");
        System.out.println(s);
        //删remove
        hm.remove("黄晓明");
        System.out.println(hm);
        //获取  get
        String 大黑牛 = hm.get("大黑牛");
        System.out.println(大黑牛);

    }
}
