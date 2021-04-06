package 网易;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Qitong!!
 * @Date 2020/9/12
 */
public class 送快递 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int remain = sc.nextInt();
        int[] ways = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            ways[i] = sc.nextInt();
        }

        System.out.println(findMaxTimes(n, remain, ways));
    }


    //todo: 找到可以送快递次数最多的路
     static int findMaxTimes(int n,int remain,int[] ways){
        if (ways == null) return 0;
        int res = 0;
        dfs(remain);
        return res;
    }

    private static void dfs(int remain) {
        //如果进入到最后一层!
        if(remain == 0){
            //就会得到一个正确的解

            return;
        }


        //枚举这层所有的可能

        }
    }
