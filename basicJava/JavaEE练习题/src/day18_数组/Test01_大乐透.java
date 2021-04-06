package day18_数组;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;

/*
模拟大乐透号码：
    一组大乐透号码由10个1-99之间的数字组成
    定义方法，打印大乐透号码信息
    代码实现，效果如图所示：
开发提示：
    使用数组保存录入的号码
 */
public class Test01_大乐透 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 66, 70, 80, 99};
        printNum(arr);
    }

    static void printNum(int[] arr) {
        System.out.println("您的大乐透号码为:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
