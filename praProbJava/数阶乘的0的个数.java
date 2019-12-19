package day01;


/*
描述
设计一个算法，
样例  1:
	输入: 11
	输出: 2

	样例解释:
	11! = 39916800, 结尾的0有2个。

样例 2:
	输入:  5
	输出: 1

	样例解释:
	5! = 120， 结尾的0有1个。

 */
public class 数阶乘的0的个数 {
    public static void main(String[] args) {
        System.out.println(count(105));
        ;
    }

    public static long count(long l) {

        long sum = 0;
        while (0 != l / 5) {

            sum += l / 5;
            l /= 5;
        }
        return sum;
    }
}
