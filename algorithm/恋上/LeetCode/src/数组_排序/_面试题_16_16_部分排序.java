package 数组_排序;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/sub-sort-lcci/
 * @Auther Qitong!!
 * @Date 2020/6/10
 */
public class _面试题_16_16_部分排序 {
    public static void main(String[] args) {
        int[] arr ={1,3,9,7,5};
        System.out.println(Arrays.toString(subSort(arr)));
    }



    /**
     * @Author Qitong~
     * @Description //TODO 给定一个整数数组，编写一个函数，找出索引m和n，只要将索引区间[m,n]的元素排好序，
     *                  整个数组就是有序的。注意：n-m尽量最小，也就是说，找出符合条件的最短序列。
     *                  函数返回值为[m,n]，若不存在这样的m和n（例如整个数组是有序的），请返回[-1,-1]。
     * @Date 18:31 2020/6/10
     * @Param [array]
     * @return int[]
     **/
    public static int[] subSort(int[] array) {
        if (array==null ||array.length == 0 ) return new int[] {-1,-1};

        //找到右边最后一个逆序对
        int r = -1;
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] >= max){
                max = array[i];
            }else{
                r = i;
            }
        }
        //找到左边最后一个逆序对
        int l = -1;
        int min = array[array.length-1];
        for (int i = array.length-2; i >=0; i--) {
            if (array[i] <= min){
                min = array[i];
            }else{
                l = i;
            }
        }
        return new int[]{l,r};
    }
}
