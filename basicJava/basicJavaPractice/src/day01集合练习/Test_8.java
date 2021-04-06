package day01集合练习;

import java.util.ArrayList;

/*
练习八：Collection集合返回首次出现索引
八、定义一个方法listTest(ArrayList<Integer> al, Integer s)，
     要求返回s在al里面第一次出现的索引，如果s没出现过返回-1;
 */
public class Test_8 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(4);
        arrayList.add(4);
        System.out.println(listTest(arrayList,3));

    }
    /*
    参数列表:ArrayList<Integer> al, Integer s
    方法名称:listTest
    返回值:int
     */
    public static  int listTest(ArrayList<Integer> al, Integer s) {
        int index = 0;
        for (int i = 0; i < al.size(); i++) {
            if (al.get(i)==s){
                return i;
            }
        }
        return  -1;

    }
}
