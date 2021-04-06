package com.qitong;

//二维数组中找数,每行从小到大,每列从小到大
public class P04FindOrderMatrix {
    //从左下或者右上开始,每次课排除一行或者一列

    //从右上角开始找
    public static boolean findOrderMatrix(int target,int[][] matrix){
        int column =matrix[0].length -1;
        int row =0;

        while (column>=0 && row<= matrix.length-1) {
            if (matrix[row][column] ==target){
                return true;
            }
            else if (matrix[row][column] < target) {
                row++;
            } else {
                column--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix ={{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        System.out.println("findOrderMatrix(6,matrix) = " + findOrderMatrix(6, matrix));
        System.out.println("findOrderMatrix(16,matrix) = " + findOrderMatrix(16, matrix));
    }
}
