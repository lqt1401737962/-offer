package day05_Math类;

/*
    键盘录入QQ号码，验证格式的正确性。
    必须是5—12位数字。
    0不能开头。
 */
public class Test02_需求实现 {
    public static void main(String[] args) {
        boolean check = check("23415432664356");
        System.out.println(check);
    }
    public  static  boolean check(String s) {
        if (s.length()<5||s.length()>12){
            return false;
        }
        else if(s.charAt(0)==0){
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c<'0'||c>'9'){
                return false ;
            }
        }
        return true;
    }
}
