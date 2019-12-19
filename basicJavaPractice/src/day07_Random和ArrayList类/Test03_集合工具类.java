package day07_Random和ArrayList类;

import java.util.ArrayList;
import java.util.Arrays;

/*
    集合工具类。
        定义findIndex方法，在某集合中，查找某元素，返回第一次出现的索引。
        定义replace方法，将某集合中的某元素，全部替换为新元素。
 */
public class Test03_集合工具类 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(21);
        arrayList.add(1);
        arrayList.add(71);
        arrayList.add(91);
        int index = findIndex(arrayList, 71);
        System.out.println(index);
        replace(arrayList,71,88);
        System.out.println(arrayList);
    }
    private static int findIndex(ArrayList<Integer> arr,int n ){
        for (int i = 0; i < arr.size(); i++) {
            Integer in = arr.get(i);
            if (in==n){
                return i;
            }
        }
        return -1;
    }
    private static void replace(ArrayList<Integer> arr,int old,int n){
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i)==old){
                arr.set(i,n);
            }
        }
    }
}
