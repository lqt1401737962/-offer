package leetcode;
/*
判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
示例 1:
    输入: 121
    输出: true
示例 2:
    输入: -121
    输出: false
解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
示例 3:
    输入: 10
    输出: false
解释: 从右向左读, 为 01 。因此它不是一个回文数。

 */
public class 回文数 {
    public  static boolean isSame(int n ){
        if (n<0) return false;
        int rev =0;
        if (n% 10==0) return false;
        while (rev < n){
            int pop =n%10;
            n /=10;
            rev= rev*10 +pop;
        }
        return rev==n || rev/10==n;
    }

    public static void main(String[] args) {
        System.out.println(isSame(123321));
        System.out.println("isSame(-1234321) = " + isSame(-1234321));
        System.out.println("isSame(1234321) = " + isSame(1234321));
    }
}
