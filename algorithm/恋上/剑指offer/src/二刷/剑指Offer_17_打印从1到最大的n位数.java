package 二刷;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/da-yin-cong-1dao-zui-da-de-nwei-shu-lcof/
 *
 * @author Qitong!!
 * @Date 2020/7/1
 */
public class 剑指Offer_17_打印从1到最大的n位数 {
    private List<String> res;
    private int n;
    private StringBuilder sb;

    //因为有大数的问题! 有限字符串解题!
    public List<String> printNumbers(int n) {
        if (n < 1) return null;
        this.n = n;
        res = new ArrayList<>();
        sb = new StringBuilder();

        dfs(0);

        return res;
    }

    private void dfs(int index) {
        //到大第n位, 处理逻辑!
        if (index == n) {
            while (sb.length() != 0 && sb.charAt(0) == '0') {
                sb.deleteCharAt(0);
            }
            if (sb.length() != 0) res.add(sb.toString());
            return;
        }
        //枚举每一种情况!
        for (int i = 0; i < 10; i++) {
            sb.append(i);
            dfs(index + 1);
            if (sb.length() != 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
        }
    }

    //题目
    public int[] printNumbers2(int n) {
        int max = (int) Math.pow(10, n) - 1;
        int[] res = new int[max];
        for (int i = 0; i <= max; i++) {
            res[i] = i + 1;
        }
        return res;
    }

    public static void main(String[] args) {
        剑指Offer_17_打印从1到最大的n位数 o = new 剑指Offer_17_打印从1到最大的n位数();
        List<String> strings = o.printNumbers(7);
        for (String string : strings) {
            System.out.print(string + ",");
        }
    }

}
