package leetcode;

import java.util.Arrays;

public class 移动零 {
    public  void moveZero(int[] nums){
        if (nums ==null){
            return;
        }
        int count =0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==0){
                count++;
            }else{
                swap(nums,i-count,i);
            }
        }
    }

    private void swap(int[] arr,int a,int b) {
        int temp =arr[a];
        arr[a] = arr[b] ;
        arr[b] =temp;
    }

    public static void main(String[] args) {
        int[] arr ={0,2,0,2,0,4,0,1};
        移动零 移动零 = new 移动零();
        移动零.moveZero(arr);
        System.out.println(Arrays.toString(arr));
    }
}
