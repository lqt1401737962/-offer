package day05_Math类;
/*
1.直接在构造String时建立。 char data[] = {'s', 'g', 'k'}; String str = new String(data);
2.String有方法可以直接转换。 String.valueOf(char[] chr)就可以。
 如： char[] cha = {'s','g','h'}; String n = String.valueOf(cha);
 */
public class Test01_翻转字符串 {
    public static void main(String[] args) {
        System.out.println(reverse("fdsafkga"));;
    }
    public static  String reverse(String s){
        char[] chars = s.toCharArray();
        char[] chars1 = new char[chars.length];
        int a =0;
        for (int i = chars.length - 1; i >= 0; i--) {

            chars1[a++]=chars [i];
        }
        String s1 =new String(chars1);
        return s1;
    }
}
