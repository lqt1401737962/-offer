package leetcode;

/*
 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
示例 1:
    输入: 123
    输出: 321
 示例 2:
    输入: -123
    输出: -321
示例 3:
    输入: 120
    输出: 21
注意:
    假设我们的环境只能存储得下 32 位的有符号整数，
    则其数值范围为 [−231,  231 − 1]。请根据这个假设，
    如果反转后整数溢出那么就返回 0。
 */
public class 整数翻转 {
    public  static int reverseNum( int n){
        int res =0;
        while (n != 0){
            int pop=n% 10;
            n /=10;
            if (res>Integer.MAX_VALUE/10 ||(res==Integer.MAX_VALUE/10&& pop>7)) return -1;
            if (res<Integer.MIN_VALUE/10 || (res==Integer.MIN_VALUE/10&& pop<-8))return -1;
            res =res*10+pop;
        }
        return res;
    }

    public static void main (String[] args){
        System.out.println("reverseNum(-134) = " + reverseNum(-134));
        System.out.println("reverseNum(2423) = " + reverseNum(2423));
        System.out.println("reverseNum(2147483647) = " + reverseNum(2147483647));

    }
}
