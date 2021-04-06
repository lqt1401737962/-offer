package 广联达;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Qitong!!
 * @Date 2020/9/9
 */
public class 各种不同 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(getAns(res)));
        int[] ans = getAns(res);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }

    static int[] getAns(int[] res){
        //有几个可以合并的
        int x=0;
        int cut =0;
        do {
             x= 0;
            int cur =0;
            int now =0;
            for (int i = cur+1; i < res.length; i++) {
                if (res[cur] == res[i] ) {
                    cur = i+1;
                    x++;
                    cut+=x;
                    res[now] = res[cur]<<1;
                }
            }

        }while (x!=0);
        return Arrays.copyOfRange(res,0,res.length);

    }
}
