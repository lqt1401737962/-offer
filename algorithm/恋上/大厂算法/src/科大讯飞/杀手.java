package 科大讯飞;

import jdk.nashorn.internal.runtime.linker.LinkerCallSite;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Qitong!!
 * @Date 2020/7/31
 */

/*杀手
* 题目：
　　有n个杀手排成一行，每个杀手都有一个不同的编号（编号为1-n），在每个夜晚，
* 杀手都会行动，如果某个杀手编号大于他右边的杀手的编号，他就会杀死他右边的杀手，
* 杀手的行动是瞬间的，因此一个人可能某一个演完既杀死了别人，又被别人杀死了，
* 例如3,2,1这个顺序，在第一个夜晚2会杀死1，同时3会杀死2.显然易见，一段时间之后，
* 就不会有人杀死或者被杀了，平安夜也就来了，请问在平安夜之前有多少个夜晚？

* 输入:第一行是一个整数n（1<=n<=100000）,表示杀手的数量。 接下来一行有n个数，是一个1-n的全排列。
* 输出: 输出包含一个整数，表示平安夜之前经历个多少了夜晚。
*   样例输入
        10
        10 9 7 8 6 5 3 4 2 1
    样例输出
        2
* **/

public class 杀手 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        if (!list.isEmpty()){
            System.out.println(nightCount(list));
        }

    }
    private static int nightCount(ArrayList<Integer> list){
        int row = list.size();
        int nights = 0;
        while (list.size() > 1){
            for (int i = list.size()-1; i >= 1; i--) {
                if (list.get(i) < list.get(i-1)) list.remove(i);
            }
            if (row == list.size()){
                break;
            }else{
                row = list.size();
                nights++;
            }
        }
        return nights;
    }
}
