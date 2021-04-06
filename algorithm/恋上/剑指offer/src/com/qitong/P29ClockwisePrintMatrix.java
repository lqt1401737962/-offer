package com.qitong;
//转圈打印矩阵
public class P29ClockwisePrintMatrix {
    public static void print(int[][] matrix) {
    int leftX=0;
    int leftY=0;
    int rightX =matrix[0].length-1;
    int rightY =matrix.length-1;

    while (leftX<=rightX&& leftY<=rightY){
        printEdge(matrix,leftX++,leftY++,rightX--,rightY--);
    }
    }

    private static void printEdge(int[][] matrix,int leftX,int leftY,int rightX,int rightY) {
        //only row
        if (rightY==leftY){
            for (int i = leftX; i <=rightX ; i++) {
                System.out.print(matrix[i][leftY]+" ");
            }
        }
        //Only column
        if (leftX ==rightX){
            for (int i = leftY; i <=rightY ; i++) {
                System.out.print(matrix[leftX][i]+" ");
            }
        }else{// usually case
            int curX =leftX;
            int curY =leftY;

            while (curY!= rightY){
                System.out.print(matrix[curX][curY]+" ");
                curY++;
            }
            while (curX!=rightX){
                System.out.print(matrix[curX][curY]+" ");
                curX++;
            }
            while (curY!=leftY){
                System.out.print(matrix[curX][curY]+" ");
                curY--;
            }
            while (curX!=leftX){
                System.out.print(matrix[curX][curY]+" ");
                curX--;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        print(matrix);
    }
}
