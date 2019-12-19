package day08_stream流练习;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/*1.
使用lambda表达式分别将以下功能封装到Function对象中
        a)	求Integer类型ArrayList中所有元素的平均数
        b)	将Map<String,Integer>中value存到ArrayList<Integer>中

3.	以学生姓名为key成绩为value创建集合并存储数据，使用刚刚创建的Function对象求学生的平均成绩


 */
public class Test02_Function接口 {
    public static void main(String[] args) {
//        使用lambda表达式分别将以下功能封装到Function对象中
//        a)	求Integer类型ArrayList中所有元素的平均数

        Function<ArrayList<Integer>,Integer> f1=(list)->{
        Integer integer=0;
            for (Integer integer1 : list) {
                integer+=integer1;
            }
            return  integer/list.size();
        };

 //        b)	将Map<String,Integer>中value存到ArrayList<Integer>中
        Function<Map<String,Integer>,ArrayList<Integer>> f2=(map)->{
            Collection<Integer> values = map.values();
            ArrayList<Integer> arrayList = new ArrayList<>();
            arrayList.addAll(values);
            return arrayList;
        };
        /*2.	已知学生成绩如下
        姓名	成绩
        岑小村	59
        谷天洛	82
        渣渣辉	98
        蓝小月	65
        皮几万	70*/
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("岑小村",59);
        hm.put("谷天洛",82);
        hm.put("渣渣辉",98);
        hm.put("蓝小月",65);
        hm.put("皮几万",70);
        Integer result = f2.andThen(f1).apply(hm);
        System.out.println("这个班的平均成绩是:"+result);

    }
}
