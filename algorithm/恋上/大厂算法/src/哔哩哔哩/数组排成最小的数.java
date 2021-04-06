package 哔哩哔哩;

import java.util.Arrays;
import java.util.Scanner;

/**nowcoder.com/question/next?pid=20725618&qid=643389&tid=35868163
 * @author Qitong!!
 * @Date 2020/8/12
 */
public class 数组排成最小的数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] splits = s.split(",");
        int[] nums = new int[splits.length];
        for (int i = 0; i < splits.length; i++) {
            nums[i] = Integer.valueOf(splits[i]);
        }
        System.out.println(minNumber(nums));
    }
    public static String minNumber(int[] nums) {
        if (nums == null || nums.length == 0) return null;

        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strs[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(strs,(x, y)->(x+y).compareTo((y+x)));
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str);
        }
        return sb.toString();
    }
}
