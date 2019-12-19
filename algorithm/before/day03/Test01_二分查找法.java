package day03;


/*
        给定一个排序的整数数组（升序）和一个要查找的整数target，
        用O(logn)的时间查找到target第一次出现的下标（从0开始），
        如果target不存在于数组中，返回-1。
 */
public class Test01_二分查找法 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 8, 9, 11, 23, 23, 55, 77, 99, 345, 768, 5555};
        int i = binarySearch(arr, 23);
        System.out.println(i);
    }

    private static int binarySearch(int[] arr, int n) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == n) {
                end = mid;
            } else if (arr[mid] < n) {
                start = mid + 1;
            } else {
                end = end - 1;
            }

        }
        if (arr[start] == n) {
            return start;
        }
        return -1;

    }
}
