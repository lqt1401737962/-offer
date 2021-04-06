package 二刷;

/**https://leetcode-cn.com/problems/yuan-quan-zhong-zui-hou-sheng-xia-de-shu-zi-lcof/
 * @author Qitong!!
 * @Date 2020/7/22
 */
public class 剑指Offer_62_圆圈中最后剩下的数字 {
    //如果从k号开始  + k就可以了
    //这些是 默认从 0 开始
    public  int lastRemaining(int n ,int m ,int k){
        return lastRemaining(n,m)+ k;

    }
    public  int lastRemaining(int n, int m) {
//
//        if (n ==1) return 0;
//        return (lastRemaining(n - 1 ,m) + m) % n;
        return n == 1? 0 : (lastRemaining(n-1,m)+m) %n;
    }


    //非递归!!自底向上
    // f(1, 3) = 0
    // f(2, 3) = (f(1, 3) + 3) % 2
    // ...
    // f(7, 3) = (f(6, 3) + 3) % 7
    // f(8, 3) = (f(7, 3) + 3) % 8
    // f(9, 3) = (f(8, 3) + 3) % 9
    // f(10, 3) = (f(9, 3) + 3) % 10
    public int lastRemaining2(int n, int m){
        int res = 0;
        for (int i = 2; i <= n; i++) {
            res = (res + m)%i;
        }
        return res;
    }
}
