package 前行;

import java.util.ArrayList;

import java.util.List;

/**
 * @author Qitong!!
 * @Date 2020/8/1
 */
public class 亲7的数 { int count =0;
   public int love7 (int[] digit){
       return permuteUnique(digit);
   }
    public int permuteUnique(int[] nums) {
        if (nums == null) return 0;
        List<List<Integer>> list = new ArrayList<>();
        if (nums.length == 0) return 0;
        dfs(0,nums,list);
        return count;
    }

    private void dfs(int index, int[] nums, List<List<Integer>> list) {
        //到最后一层
        if (index == nums.length){
            List<Integer> res = new ArrayList<>();
            for (int val: nums){
                res.add(val);
            }
            Integer[] ts = res.toArray(new Integer[0]);
            int ints = 0;
            for (int i = 0; i < ts.length; i++) {
                Integer temp = ts[i];
                ints =ints * 10+temp;
            }
            if (ints %7 == 0) count ++;
            res.forEach(System.out::print);
            System.out.println();
            return;
        }

        //枚举这一层可以做的选择
        for (int i = index; i < nums.length; i++) {
            //保证每一个位置只出现一次
            if (isRepeat(nums,index,i)) continue;
            swap(nums,index,i);
            dfs(index+1,nums,list);
            swap(nums,index,i);
        }
    }

    private boolean isRepeat(int[] nums, int index, int i) {
        for (int j =index; j<i ;j++){
            if (nums[j] == nums[i]) return true;
        }
        return false;
    }
    private void swap(int[] nums ,int index,int i){
        int temp = nums[index];
        nums[index] = nums[i];
        nums[i] = temp;
    }

    public static void main(String[] args) {
        亲7的数 o = new 亲7的数();
        System.out.println(o.permuteUnique(new int[]{1, 2, 2}));
//        int[] array = {1, 1, 2};
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(1);
//        list.add(2);
//        Integer[] ts = list.toArray(new Integer[0]);
//        int res = 0;
//        for (int i = 0; i < ts.length; i++) {
//            Integer temp = ts[i];
//            res =res * 10+temp;
//        }
//        System.out.println(res);
//
//       // System.out.println(Integer.parseInt(Arrays.toString(ts)));
//

    }
}
