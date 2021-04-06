package 数组_排序;

import com.sun.org.apache.xpath.internal.WhitespaceStrippingElementMatcher;
import jdk.nashorn.internal.ir.WhileNode;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/squares-of-a-sorted-array/
 * @author Qitong!!
 * @Date 2020/6/11
 */
public class _977_有序数组的平方 {

    public static void main(String[] args) {

    }
    /**
     * @Author Qitong~
     * @Description //TODO 给定一个按非递减顺序排序的整数数组 A，返回每个数字的平方组成的新数组，
     *                  要求也按非递减顺序排序。
     *                  输入：[-4,-1,0,3,10]
     *                  输出：[0,1,9,16,100]
     * @Date 12:22 2020/6/11
     * @Param [A]
     * @return int[]
     **/
    //时间O(N) 空间 O(N)
    public int[] sortedSquares(int[] A){
        if (A == null ) return null;
        int[] res = new int[A.length];
        int i = 0,j = A.length-1,cur=A.length-1;
        while (i<=j){
            if(A[i]*A[i]> A[j]*A[j]){
                res[cur--] = A[i]*A[i];
                i++;
            }else{
                res[cur--] = A[j]*A[j];
                j--;
            }
        }
        return res;
    }


    //时间O(nlogn) 空间 O(N)
    public int[] sortedSquares1(int[] A) {
        if (A == null ||A.length <1) return new int[]{};

        int[] res = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            res[i]=A[i] *A[i];
        }
        Arrays.sort(res);
        return res;
    }
}
