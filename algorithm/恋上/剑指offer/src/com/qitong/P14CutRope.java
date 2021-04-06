package com.qitong;
//14 剪绳子
public class P14CutRope {
    //贪婪算法
    public int maxCutRope(int length){
        if (length <1){
            return 0;
        }
        if (length ==2){
            return 1;
        }
        if (length == 3){
            return 2;
        }
        int Times3 =length /3;
        if ((length -Times3*3)==1){
            Times3 -=1;
        }
        int Times2 = (length -Times3*3)/2;
        return (int)Math.pow(3,Times3)+(int)Math.pow(2,Times2);
    }
}
