package com.qitong;

//3-2 不修改数组找出重复数字
public class P02_2FindDuplicateNumNoEdit {

    public static int findDuplicateNumNoEdit(int [] nums,int length){
        if (nums == null ||nums.length <2){
            return -1;
        }

        int start =1;
        int end =length -1;
        while (start <= end){
            int mid =start +((end -start)>>1);
            int count = getCount(nums, nums.length, start, mid);
            if (start == end){
                if (count>1){
                    return start;
                }else {
                    return -1;
                }
            }

            else if (count > (mid -start +1)){
                end = mid;
            }else{
                start =mid +1;
            }
        }
        return -1;
    }

    private static int getCount(int[] nums,int length,int start,int mid){
        int count =0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>=start && nums[i]<=mid){
                count ++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
//        int[] nums ={2,3,1,4,2,5,3};
//        System.out.println("findDuplicateNum = " + findDuplicateNumNoEdit(nums, nums.length));


        String str = ",,";
        String[] split = str.split(",");
        System.out.println(str.split(",").length);
    }
}
