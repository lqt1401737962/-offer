package KMP;

import java.util.Arrays;

public class Kmp_Algorithm {

    public static int[] getNext(char[] t ){
        if (t.length==1){
            return new int[]{-1};
        };

        int[] next = new int[t.length];
        next[0] = -1;
        next[1] = 0;
        int pos =2;          //pos后缀数
        int cn =0;          //cn前缀数

        while (pos< next.length){
           if (t[pos-1]==t[cn]){
               next[pos++] = ++cn;
           }else if (cn > 0){
               cn = next[cn];
           }
           else{
               next[pos++] = 0;
           }
        }

        return next;
    }

    public  static  int getIndexOf(String S,String T ){
        if (S ==null ||T ==null || S.length() <1|| T.length()>S.length()){return -1;}

        char[] s = S.toCharArray();
        char[] t = T.toCharArray();
        int si = 0;
        int ti=0;
        int[] next = getNext(t);
        while (si< s.length && ti< t.length ){
            if (s[si]==t[ti]){
                si++;
                ti++;
            }else if (next[ti]==-1){
                si++;
            }else{
                ti = next [ti];
            }
        }
        return ti == t.length ?  si -ti: -1;
    }


    public static void main (String [] args){
        String s ="ababaaac";
        String t ="aaac";
        int[] next = getNext(s.toCharArray());
        System.out.println("Arrays.toString(next) = " + Arrays.toString(next));
        System.out.println("getIndexOf = " + getIndexOf(s, t));
    }
}
