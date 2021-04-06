package 科大讯飞;

import java.util.Scanner;

/**
 * @author Qitong!!
 * @Date 2020/7/31
 */
/*
 * 题目：
 * 华老师的n个学生参加了一次模拟测验，考出来的分数很糟糕，但是华老师可以将成绩修改为[0,100]中的任意值
 * 所以他想知道，如果要使所有人的成绩的平均分不少于X分，至少要改动多少个人的分数？
    输入
        第一行一个数T，共T组数据（T≤10）
        接下来对于每组数据：
        第一行两个整数n和X。（1≤n≤1000, 0≤X≤100）
        第二行n个整数，第i个数Ai表示第i个学生的成绩。（0≤Ai≤100）
    输出
        共T行，每行一个整数，代表最少的人数。
        * 样例:
            2
            5 60
            59 20 30 90 100
            5 60
            59 20 10 10 100

 **/
public class 改分数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //表示有T组数
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n =sc.nextInt();
            //平均分
            int X =sc.nextInt();
            int[] scores = new int[n];
            for (int j = 0; j < n; j++) {
                scores[j]=sc.nextInt();
            }
            System.out.print(updateNum(scores,X)+" ");
        }
    }

    //todo: 获取需要修改成绩的次数
    public static int updateNum(int[] scores,  int x) {
        if (scores == null || scores.length == 0)return -1;

        int res =0;
        while (averageScores(scores) < x){
            scores[findMinIndex(scores)] = 100;
            res++;
        }

        return res;
    }

    //todo: 获得平均分
    private static int averageScores(int[] scores){
        if (scores == null || scores.length==0) return 0;
        int sum = 0;
        for (int score : scores) {
            sum +=score;
        }
        return sum/scores.length;
    }
    //todo: 找到最小的数的下标
    private static int findMinIndex(int[] scores ){
        int minIndex = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[minIndex] > scores[i]) minIndex = i;
        }
        return minIndex;
    }
}
