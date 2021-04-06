package 贝壳找房;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Qitong!!
 * @Date 2020/9/7
 */
public class 牛牛和牛妹石头剪刀 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //n表示要进行的回合数~
        int n = sc.nextInt();
        List<String[]> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {

            String s = sc.nextLine();
            String[] s1 = s.split(" ");
            res.add(s1);
        }

        solve(res);
    }


    private static void solve(List<String[]> list){
        for (String[] strings : list) {
            if (strings[0]=="S"&& strings[2]!="J"||strings[3]!= "J" ){
                if (strings[1]=="S"){
                    System.out.println("same");
                    continue;
                }else {
                    System.out.println("");
                }
            }//else if ()
        }
    }
}
