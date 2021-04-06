package 高频题;


/**
 * https://leetcode-cn.com/problems/reverse-integer/
 * @author Qitong!!
 * @Date 2020/6/22
 */
public class _7_整数反转 {
    public int reverse(int x) {
        long  res =0;
        while (x != 0){
            int mod = x %10;
            x = x / 10;
            res = res*10 + mod;
            if (res > Integer.MAX_VALUE ||res< Integer.MIN_VALUE) return  0;
        }
        return (int)res;
    }

    //通用的!! 但效率 可能有点低!
    public int reverse1(int x) {
        int res =0;
        while (x != 0){
            int preRes = res;
            int mod = x %10;
            x = x / 10;
            res = res*10 + mod;
            if ((res -mod)/10 != preRes) return  0;
        }
        return res;
    }
}
