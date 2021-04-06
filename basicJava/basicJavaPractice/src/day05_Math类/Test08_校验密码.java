package day05_Math类;

/*
    必须至少8个字符。
    必须至少2个大写字符。
    必须只有字母和数字。
 */
public class Test08_校验密码 {
    public static void main(String[] args) {
        boolean j = checkQQ("JJH2341245g");
        System.out.println(j);
    }
    public static boolean checkQQ(String passWord) {
        if (passWord.length() < 8) {
            return false;
        }
        int count = 0;
        char[] chars = passWord.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            if (aChar > 'A' && aChar < 'Z') {
                count++;
            }
            if ((aChar < '0' || aChar > '9') && (aChar < 'a' || aChar > 'z') && (aChar < 'A' || aChar > 'Z')) {
                return false;
            }
        }
        if (count < 2) {
            return false;
        }else{
            return true;
        }

    }
}
