package 第四范式;

/**
 * @author Qitong!!
 * @Date 2020/8/24
 */
public class Fib {
    public static void main(String[] args) {
        System.out.println(fib(11));
    }

    //todo: 递归完成斐波那契
    private static int fib(int n){
        if(n <=2) return 1;

        return fib(n-1)+fib(n-2);
    }

    //todo: 通过动态规划完成斐波那契
    private static int fib2(int n){
        if (n<=2 )return 1;
        int one = 1;
        int two = 1;
        for (int i = 3; i <= n; i++) {
            int tem = one +two;
            one = two ;
            two = tem;
        }
        return one;
    }
}
