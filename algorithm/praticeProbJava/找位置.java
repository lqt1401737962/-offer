package day07;

public class 找位置 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6, 7};
        ;
        System.out.println(searchInsert(arr, 6));
    }

    public static int searchInsert(int[] nums, int target) {
        //二分查找法
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
