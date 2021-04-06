package 小红书;


import java.util.ArrayList;
import java.util.Arrays;


/**https://www.nowcoder.com/question/next?pid=23567630&qid=982126&tid=35089752
 * @author Qitong!!
 * @Date 2020/7/24
 */
public class Hello {
    private static int count =0;
    private static ArrayList<Integer>  res= new ArrayList<>();

    public static int pathSum(int n, int[] nums) {
        if (nums == null || nums.length ==0) return 0;
        dfs( n,nums);
        return count;
    }

    private static void dfs(int n,int[] nums) {
        if (n == 0) {
            count++;
            return;
        }
        for (int i = 0; i <nums.length ; i++) {
            res.add(nums[i]);
            n -=nums[i];
            if (n<0) break;
            dfs(n,nums);
        }
        return ;
    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int sum = scanner.nextInt();
//        String next = scanner.next();
//        int length = next.length();
//        String subString = next.substring(1,length-1);
//        String[] split = subString.split(",");
//        int[] prices = new int[split.length];
//        for(int i = 0;i < split.length;i++){
//            prices[i] = Integer.parseInt(split[i]);
//        }
//        Arrays.sort(prices);
//        System.out.println(Arrays.toString(prices));
        int sum = 10;int [] prices= new int[]{2,3,5};
        System.out.println(pathSum(sum,prices));

    }
}
