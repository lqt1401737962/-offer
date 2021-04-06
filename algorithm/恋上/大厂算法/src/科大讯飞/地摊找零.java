package 科大讯飞;

;
import java.util.Scanner;

/**
 * @author Qitong!!
 * @Date 2020/7/31
 */
public class 地摊找零 {
}
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] moneyCount = new int[5];
        for (int i = 0; i < 5; i++) {
            moneyCount[i] =sc.nextInt();
        }
        //要支付的金额
        int total = sc.nextInt();
        System.out.println(minCount(moneyCount,total));
    }

    //TODO: 最少需要的张数!
    private static  int minCount(int[] money,int k){
        //贪心
        int res = 0;
        while (k > 0){
            if (k >= 100&&money[4]>0){
                res++;
                money[4]--;
                k -=100;
            } else if (k>= 50&& money[3] >0 ){
                res++;
                money[3]--;
                k -=50;
            }else if ( k>= 10&& money[2] >0){
                res++;
                money[2]--;
                k -= 10;
            }else if ( k>= 5&& money[1] >0){
                res++;
                money[1]--;
                k -=5;
            }else if(k>= 1&& money[0] >0) {
                res++;
                money[0]--;
                k -=1;
            }else{
                return -1;
            }
        }
        if (k == 0) return res;
        return -1;
    }
}
