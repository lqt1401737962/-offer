package com.qitong;


//替换空格
//将字符串里的空格替换成%20
public class P05ReplaceBlankSpace {
    public static  String replaceBlankSpace(String str){
        String res = str.replaceAll(" ", "%20");
        return res;
    }

    public static  String replaceBlankSpace2(String s){
            if (s==null|| s.length()<1){
                return null;
            }
            int count =0;
            char[] chars = s.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (chars[i]== ' '){
                    count ++;
                }
            }
            char[] res = new char[chars.length+ 2*count];
            int resl =res.length-1;
            int charl =chars.length -1;
            for (int i =charl; i >= 0; i--) {
                if (chars[i] !=' ' ){
                    res[resl--] = chars[i];
                }else{
                    res[resl--] ='0';
                    res[resl--] ='2';
                    res[resl--] ='%';
                }
            }

            return String.valueOf(res);
    }




    public static void main(String[] args) {
        String str ="We are happy!";
        System.out.println("replaceBlankSpace(str) = " + replaceBlankSpace(str));
        System.out.println("replaceBlankSpace2(str) = " + replaceBlankSpace2(str));
    }

}
