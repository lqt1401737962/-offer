package day07_Random和ArrayList类;

import java.util.Random;
import java.util.stream.IntStream;

/*
        随机验证码。
            随机生成十组六位字符组成的验证码。
            验证码由大小写字母、数字字符组成。
        提示:
            使用字符数组保存原始字符，利用Random类生成随机索引。
 */
public class Test01_随机验证码 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("随机生成的验证码是:" + getString());
        }

    }

    public static String getString() {
        char[] c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        String result = "";
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            int index = random.nextInt(c.length);
            result += c[index];
        }
        return result;

    }

}
