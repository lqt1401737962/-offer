package 哔哩哔哩;

import java.util.*;

/**
 * @author Qitong!!
 * @Date 2020/8/13
 */
public class 是否有三数之和 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] strings = s.split(",");
        String[] arr = strings[1].split(" ");
        int[] array = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            array[i] = Integer.valueOf(arr[i]);
        }
        Integer target = Integer.valueOf(strings[1]);
        List<List<Integer>> list = threeSum(array, target);
        System.out.println( list.size()== 0? "False":"True");

    }
    public static List<List<Integer>> threeSum(int[] nums,int target) {
        if(nums == null) return null;

        List<List<Integer>> res = new ArrayList<>();
        if (nums.length < 3) return res;

        //排序
        Arrays.sort(nums);
        //i来扫描 三元组的第一个元素
        int lastIndex = nums.length -3;
        int lastR = nums.length -1;
        for (int i = 0; i <= lastIndex; i++) {
            //去重
            if (i> 0 &&nums[i] == nums[i-1]) continue;

            int l = i+1, r = lastR, remain = target-nums[i];
            while (l < r){
                int sumLr = nums[l] + nums[r];
                //表示找到了符合的三元数
                if (sumLr == remain){
                    res.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    //去重
                    while (l<r && nums[l] == nums[l+1]){l++;}
                    while (l<r && nums[r] == nums[r-1]){r--;}
                    //向中间逼近!!
                    l++;
                    r--;
                }else if(sumLr < remain){
                    l++;
                }else{
                    r--;
                }
            }
        }
        return res;
    }
}
