package com.qitong;


//得到数组中超过一半的数字
public class P39GetMoreThanHalfNumber {

    public static int getNum(int[] arr){
        if (arr==null||arr.length<1){
            throw new RuntimeException("数组为空");
        }
        int res =arr[0];
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            count = res==arr[i]? count++ : count--;
            if (count ==0){
                res =arr[i];
                count =1;
            }
        }

        count =0;
        for (int i = 0; i < arr.length; i++) {
            count = res==arr[i]? ++count: count;
        }
        return count>arr.length/2? res: -1;
    }

    public static void main(String[] args) {
        int[] arr ={2,2,1};
        System.out.println(getNum(arr));
    }
}
