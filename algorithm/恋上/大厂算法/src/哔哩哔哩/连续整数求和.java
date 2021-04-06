package 哔哩哔哩;

import sun.misc.PostVMInitHook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**https://www.nowcoder.com/question/next?pid=20725635&qid=643169&tid=35877508
 * @author Qitong!!
 * @Date 2020/8/12
 */
public class 连续整数求和 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(findContinuousSequence(n));
    }
    //时间复杂度O(N) 空间O(1)
    public static int findContinuousSequence(int target) {
        //记录符合条件的值的次数
        int count = 0;
        if (target <= 0) return count;
        //双指针,默认从1开始 如果l= r 则不符合结束!!
        for (int l = 1, r = 2; l < r; ) {
            //根据等差数列的求和!!
            int sum = (l + r) * (r - l + 1) >> 1;
            //如果命中!则 ..处理逻辑
            if (sum == target) {
                int[] res = new int[r - l + 1];
                for (int i = l; i <= r; i++) {
                    res[i - l] = i;
                }
                count++;
                r++;
            } else if (sum > target) {
                l++;
            } else {
                r++;
            }
        }
        return count;
    }
}
