package 浩鲸科技;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 * @author Qitong!!
 * @Date 2020/7/25
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String s = String.valueOf(num);
        System.out.println(retNewNum(s));
    }

    public static int retNewNum(String s){
        char[] chars = s.toCharArray();
        HashMap<Character, Integer> hm = new HashMap<>();
        ArrayList<Integer> res = new ArrayList<>();
        int cur =0;
        for (int i = chars.length-1; i >= 0; i--) {
            if (hm.containsKey(chars[i])) continue;;
            res.add(chars[i]-'0');
            hm.put(chars[i],1);
        }
        return Integer.valueOf(String.valueOf(res));
    }
}
