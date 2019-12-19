package day04_Map接口;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//五、请使用Map集合存储自定义数据类型Car做键，对应的价格做值。
//    并使用keySet和entrySet两种方式遍历Map集合。
public class Test05_HashMap存储键是自定义对象值是String {
    public static void main(String[] args) {
        //创建HashMap
        HashMap<Car, Integer> hm = new HashMap<>();
        //添加汽车进去
        Car c1 = new Car("长安奔奔", "黄色");
        Car c3 = new Car("奇瑞QQ", "黑色");
        Car c2 = new Car("铃木奥拓", "白色");
        hm.put(c1,18888);
        hm.put(c2,8888);
        hm.put(c3,28888);
        //遍历keySet
        Set<Car> cars = hm.keySet();
        for (Car car : cars) {
            Integer price = hm.get(car);
            System.out.println(car.getColor()+car.getName()+price);
        }
        System.out.println("________________________-");
        //遍历entry
        Set<Map.Entry<Car, Integer>> entries = hm.entrySet();
        for (Map.Entry<Car, Integer> entry : entries) {
            Integer value = entry.getValue();
            Car key = entry.getKey();
            System.out.println(value+key.getName()+key.getColor());
        }

    }
}
