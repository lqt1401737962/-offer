package 彻赢科技;

import com.sun.org.apache.xpath.internal.operations.Bool;
import javafx.scene.transform.Scale;

import java.util.Scanner;

/**
 * @author Qitong!!
 * @Date 2020/8/3
 */
public class 检查是不是字符串 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] chars = input.toCharArray();
        System.out.println(isStr(chars)==true? "true":"false");

    }
    public static boolean isStr(char[] chars){
        if (chars.length < 2) return false;

        if (chars[0] == '"' && chars[chars.length - 1] == '"') {
            int count = 0;
            for (int i = 1; i < chars.length - 1; i++) {
                if (chars[i] == '"') {
                   count++;
                   if (count ==2)return false;
                }
            }
            return true;
        }
        return false;
    }

}
