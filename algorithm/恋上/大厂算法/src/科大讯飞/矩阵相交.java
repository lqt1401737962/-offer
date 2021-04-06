package 科大讯飞;

import java.util.Scanner;

/**
 * @author Qitong!!
 * @Date 2020/7/31
 */
public class 矩阵相交 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[4];
        for (int i = 0; i < 4; i++) {
            array[i] = sc.nextInt();
        }
        int[] array2 = new int[4];
        for (int i = 0; i < 4; i++) {
            array2[i] = sc.nextInt();
        }
        System.out.println(isIntersect(array,array2));
    }
    //因为给的用例符合规范,就不做特殊处理了
    private static int isIntersect(int[] arr1,int[] arr2){
        if (arr1[0]<=arr2[0]&& arr1[1]<= arr2[1]&&arr1[2]>=arr2[0]&&arr1[3]>= arr2[1]){
            return 1;
        }

        return 0;
    }
}
