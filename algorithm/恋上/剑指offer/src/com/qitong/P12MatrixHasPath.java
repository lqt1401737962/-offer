package com.qitong;


//12 矩阵中的路径
public class P12MatrixHasPath {
    public boolean hasPath(char[] matrix, int rows, int columns, char[] str){
        if (matrix == null || str ==null || rows <1|| columns<1){
            return false;
        }
        //设置标记数组看是否来过
        boolean[][] flag =new boolean[rows][columns];
        char[][] chars = toDoubleArray(matrix, rows, columns);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (process(chars,str,flag,0,i,j)){
                    return true;
                }
            }
        }
        return false;
    }
    //将一维数组转换为二维数组
    public char[][] toDoubleArray(char[] matrix,int row,int column){
        char[][] chars = new char[row][column];
        for (int i = 0,index=0; i < row; i++) {
            for (int j = 0;j< column;j++ ){
                chars[i][j] = matrix[index++];
            }
        }
        return chars;
    }

    //过程
    public boolean process(char[][] chars,char[] str,boolean[][] flag,int pathLength,int row,int column){
        //如果 路径长度相同则找到
        if (str.length==pathLength){
            return true;
        }

        if (row<0|| column<0|| row>=chars.length || column >= chars[0].length
            || chars[row][column]!= str[pathLength]|| flag[row][column]){
            return false;
        }

        flag[row][column] =true;
        if (process(chars,str,flag,pathLength+1,row-1,column)||
            process(chars,str,flag,pathLength+1,row+1,column)||
            process(chars,str,flag,pathLength+1,row,column+1)||
            process(chars,str,flag,pathLength+1,row,column-1)){
            return true;
        }
        //该字符旁边的字符都不通,返回false
        flag[row][column] =false;
        return false;
    }

    public static void main(String[] args) {
        char[] matrix = new char[]{'a','b','t','g','c','f','c','s','j','d','e','h'};
        String str ="abcd" ;
        char[] chars = str.toCharArray();
        P12MatrixHasPath p12MatrixHasPath = new P12MatrixHasPath();
        System.out.println(p12MatrixHasPath.hasPath(matrix, 3, 4, chars));

    }
}
