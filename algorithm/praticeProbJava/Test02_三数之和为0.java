package day04;

import java.util.ArrayList;
import java.util.List;

public class Test02_三数之和为0 {
    public static void main(String[] args) {

    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> l = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                int b = nums[j];
                for (int k = j + 1; k < nums.length; k++) {
                    int c = nums[k];
                    if (a + b + c == 0) {
                        ArrayList<Integer> arrayList = new ArrayList<>();
                        arrayList.add(a);
                        arrayList.add(b);
                        arrayList.add(c);
                        for (int i1 = 0; i1 < arrayList.size(); i1++) {
                            Integer in = arrayList.get(i1);
                        }
                        l.add(arrayList);
                    }
                }
            }
        }
        return l;
    }
}
