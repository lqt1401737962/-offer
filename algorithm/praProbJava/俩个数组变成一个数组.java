package day01;

import java.util.Arrays;

//合并两个有序升序的整数数组A和B变成一个新的数组。新数组也要有序。
public class 俩个数组变成一个数组 {
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 45, 88};
        int[] arr2 = {2, 3, 5, 12, 35, 98};
        int[] i = heBin(arr1, arr2);
        System.out.println(Arrays.toString(i));

    }

    public static int[] heBin(int[] a, int[] b) {
        if (a.length == 0 || b.length == 0) {
            return null;
        }

        int[] ints = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        int index = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                ints[index++] = a[i++];
            } else {
                ints[index++] = b[j++];
            }
        }
        while (i < a.length) {
            ints[index++] = a[i]++;
        }
        while (j < b.length) {
            ints[index++] = b[j++];
        }
        return ints;
    }

}
