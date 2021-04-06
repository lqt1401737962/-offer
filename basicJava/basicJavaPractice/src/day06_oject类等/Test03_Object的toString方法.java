package day06_oject类等;

public class Test03_Object的toString方法 {
    public static void main(String[] args) {
        //(1)
       /* String s1 = new String("abc");
        String s2 = "abc";
        System.out.println(s1 == s2);     	   //false
        System.out.println(s1.equals(s2));    //true*/
        //(2)
        /*String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s2);           //true
        System.out.println(s1.equals(s2)); 	    //true*/
        //(3)
        /*String s1 = "a" + "b" + "c";
        String s2 = "abc";
        System.out.println(s1 == s2);           //true
        System.out.println(s1.equals(s2));	    //true*/
        //(4)
        String s1 = "ab";
        String s2 = "abc";
        String s3 = s1 + "c";
        System.out.println(s3 == s2);           //false
        System.out.println(s3.equals(s2));   	//true

    }
}
