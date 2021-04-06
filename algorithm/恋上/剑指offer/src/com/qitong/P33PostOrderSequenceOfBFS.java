package com.qitong;

//二叉搜索树的后序遍历序列
public class P33PostOrderSequenceOfBFS {
    public static boolean isSequence(int[] sequence){
        if (sequence==null || sequence.length<1){
            return false;
        }
        return process(sequence,0,sequence.length-1);


    }

    private static boolean process(int [] arr,int start,int end) {
        if (end -start <=0){
            return true;
        }
        int root =arr[end];
        int cur =start;
        while (cur<end && arr[cur]<root){
            cur++;
        }
        for (int i = cur; i < end; i++) {
            if (arr[i]< root){
                return false;
            }
        }
        return  process(arr,start,cur-1)&&process(arr,cur,end-1);
    }

    public static void main(String[] args) {
        int [] arr = {5,7,6,9,11,10,8};
        System.out.println(isSequence(arr));
    }
}
