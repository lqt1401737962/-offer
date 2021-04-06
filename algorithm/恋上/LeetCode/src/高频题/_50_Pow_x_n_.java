package 高频题;


/**
 * https://leetcode-cn.com/problems/powx-n/
 * @author Qitong!!
 * @Date 2020/6/22
 */
public class _50_Pow_x_n_ {
    //递归!! 分治的思想!     时间O(logN) 空间 O(logN)
    public double myPow(double x, int n) {
        //确定递归基
        if (n == 1 ) return 1;
        if (n == -1) return 1/x;
        double half = myPow(x,n>>1);
        half *= half;
        return ((n & 1) == 1) ? half*x : half;
    }
    public  double myPow2(double x, int n) {
        //细节!!
        long y = n < 0? -((long)n) : n;
        double res = 1.0;
        while (y > 0){
            if ((y & 1) == 1){
                // 如果最后一个二进制位是1，就累乘上x
                res *= x;
            }
            x *= x;
            //移除最后一位!
            y >>= 1;
        }
        return n< 0? (1/res) : res;
    }


        //    快速幂补充!!
    //请设计一个算法求 的 次幂模 的结果：x^y%z(X,Y)都可能是很大的数
    //公式:: (a*b)%p ==((a%p)*(b%p)%p
    public static int powMod1(int x, int y, int z) {
        if (y < 0 || z == 0 )return 0;

        int res =1 % z;
        while (y > 0 ){
            if ((y & 1) == 1){
                res = (res*x) % z;
            }
            x = (x * x)%z;
            y>>=1 ;
        }
        return  res;
    }
    public static int powMod(int x, int y, int z) {
        if (y < 0 || z == 0) return 0;
        if (y == 0) return 1 % z;
        int half = powMod(x, y >> 1, z);
        half *= half;
        if ((y & 1) == 0) { // 偶数
            return half % z;
        } else { // 奇数
            return (half * (x % z)) % z;
        }
    }
}
