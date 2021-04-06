package day01集合练习;

import java.util.ArrayList;

/*
练习六：Collection集合isEmpty()方法的使用
    六、定义一个方法listTest(ArrayList<String> al),
        要求使用isEmpty()判断al里面是否有元素。
 */
public class Test_6 {
    public static void main(String[] args) {
        //定义集合，添加数据
        ArrayList<String> list = new ArrayList<String>();
        list.add("1");
        System.out.println(listTest(list));
    }
    /*
    参数列表:ArrayList<String> al
    返回值:boolean
    方法名称:listTest
     */
    public static boolean listTest(ArrayList<String> al){
        if (al.isEmpty()){
            return true;
        }
        return  false;
    }
}
