package 二刷;

/**
 * https://leetcode-cn.com/problems/biao-shi-shu-zhi-de-zi-fu-chuan-lcof/
 *
 * @author Qitong!!
 * @Date 2020/7/1
 */
public class 剑指Offer_20_表示数值的字符串 {
    public static boolean isNumber(String s) {
        if (s == null) return false;
        //首先要 去除 收尾空格  因为" 1.323     "也是true
        //////////////
        s = s.trim();
        char[] chars = s.toCharArray();
        //定义numSee,dotSee,eSee
        boolean numSee = false, dotSee = false, eSee = false;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= '0' && chars[i] <= '9') {
                numSee = true;
            } else if (chars[i] == '.') {
                //.之前不能出现.或者e
                if (dotSee || eSee) return false;
                dotSee = true;
            } else if (chars[i] == 'E' || chars[i] == 'e') {
                //e之前不能出现e，必须出现数
                if (eSee || !numSee) return false;
                //重置numSeen，排除123e或者123e+的情况,确保e之后也出现数
                numSee = false;
                eSee = true;
            } else if (chars[i] == '+' || chars[i] == '-') {
                //+-出现在0位置或者e/E的后面第一个位置才是合法的
                if (i != 0 && chars[i - 1] != 'e' && chars[i - 1] != 'E') return false;
            } else {
                //其他不合法字符
                return false;
            }
        }
        return numSee;
    }

    public static void main(String[] args) {
        System.out.println(isNumber("+100"));
        System.out.println(isNumber("5e2"));
        System.out.println(isNumber("-123"));
        System.out.println(isNumber("3.1416"));
        System.out.println(isNumber("0123"));
        System.out.println(isNumber("123E"));
        System.out.println(isNumber("E123"));
        System.out.println(isNumber(".234"));
        System.out.println("sdfsdf  ".trim()
        );

    }
}
