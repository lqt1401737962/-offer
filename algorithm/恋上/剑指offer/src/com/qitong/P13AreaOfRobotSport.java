package com.qitong;

import javax.swing.plaf.metal.MetalIconFactory;

public class P13AreaOfRobotSport {
    public int getCount(int threshold,int row,int column){
        if (row<1 ||column<1 || threshold<0){
            return 0;
        }
        boolean[][] flag =new boolean[row][column];
        int[][] matrix = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] =getValue(i)+getValue(j);
            }
        }

        return process(threshold,matrix,flag,0,0,row,column);
    }

    private int process(int threshold,int[][] matrix,boolean[][] flag,int i,int j,int row,int column){
        int count =0;
        if (i<0||j<0|| i>row||j>column || matrix[i][j]<threshold||flag[i][j]){
            return 0;
        }

        flag[i][j] =true;
        count =1+process(threshold,matrix,flag,i+1,j,row,column)
                +process(threshold,matrix,flag,i,j+1,row,column)
                +process(threshold,matrix,flag,i-1,j,row,column)
                +process(threshold,matrix,flag,i,j-1,row,column);
        return count;
    }

    private int getValue(int num ){
        int res =0;
        while (num > 0){
            res += num%10;
            num /=10;
        }
        return res;
    }
}
