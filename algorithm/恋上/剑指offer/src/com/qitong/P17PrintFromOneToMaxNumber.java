package com.qitong;

public class P17PrintFromOneToMaxNumber {
//简单的小数
    public static void print2(int n){
        int max =(int) Math.pow(10,n);
        for (int i = 1; i < max ; i++) {
            System.out.print(i+",");
        }
    }


    //难的
    public static void print(int n) {
        if (n <= 0) {
            throw new RuntimeException("error input!");
        }
        char[] nums=new char[n];
        for (int i = 0; i < 10; i++) {
            //数字转字符，'0' + i 是 i 的ascii码
            nums[0]=(char)('0'+i);
            process(nums,0,n);
        }
    }

    public static void process(char[] nums, int index, int len){
        if(index==len-1){
            print1(nums);
            return;
        }
        for (int i = 0; i < 10; i++) {
            nums[index+1]=(char)('0'+i);
            process(nums,index+1,len);
        }

    }

    private static void print1(char[] nums) {
        //标记位，用来判断数字0之前是否有非零数字出现过
        int flag=0;
        String str="";
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!='0'){
                flag=1;
                str+=nums[i];
            }
            if(nums[i]=='0'&&flag==1){
                str+=nums[i];
            }
        }
        System.out.print(str+" ");
    }


    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        print2(6);
        long end = System.currentTimeMillis();

        System.out.println();
        long start1 = System.currentTimeMillis();
        //print(6);
        long end1 = System.currentTimeMillis();
        System.out.println();
        System.out.println(end-start);
        System.out.println(end1-start1);
    }
}
