package leetcode;

import java.util.HashMap;

/*
给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
说明：
    你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
示例 1:
    输入: [2,2,1]
    输出: 1
示例 2:
    输入: [4,1,2,1,2]
    输出: 4

 */
public class 只出现一次的数字 {
    /**
     * hash表做 时间O(n)  空间O(n)
     * @param nums
     * @return
     */
    /*public static  int onlyOnce(int[] nums){
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int num : nums) {
            Integer count =hm.get(num);
            count  =(count == null)? 1 : ++count;
            hm.put(num,count);
        }
        for (int num : nums) {
            if (hm.get(num)==1){
                return num;
            }
        }
        return -1;
    }*/

    public static  int onlyOnce(int[] arr){
        int ans =arr[0];
        if (arr.length>1){
            for (int i = 1; i <arr.length ; i++) {
                ans =ans ^arr[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("onlyOnce = " + onlyOnce(new int[]{1, 2, 4, 1, 2, 3, 3, 4, 5, 6, 6}));
    }
}
