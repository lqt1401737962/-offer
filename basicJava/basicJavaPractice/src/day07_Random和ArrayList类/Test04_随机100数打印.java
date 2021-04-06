package day07_Random和ArrayList类;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/*
        统计数字出现次数。
            定义getNumList方法，随机生成100个数字，数字范围从1到10。
            定义printCount方法，统计每个数字出现的次数并打印到控制台。
 */
public class Test04_随机100数打印 {
    public static void main(String[] args) {
        System.out.println(getNumList());
        printCount(getNumList());
    }
    public static ArrayList<Integer> getNumList(){
        ArrayList<Integer> numList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int i1 = random.nextInt(10)+1;
            numList.add(i1);
        }
        return numList;
    }
    private static void  printCount(ArrayList<Integer> arrayList){
        int [] count =new int [10];
        for (int i = 0; i < arrayList.size(); i++) {
            Integer n = arrayList.get(i);
            count[n-1]++;
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println("数"+i+"出现次数"+count[i-1]);
        }
    }
}
