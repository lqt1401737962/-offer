package com.qitong;

import java.time.OffsetDateTime;
import java.util.jar.JarEntry;

/*
编写一个函数来查找字符串数组中的最长公共前缀。
如果不存在公共前缀，返回空字符串 ""。
    示例 1:
输入: ["flower","flow","flight"]
输出: "fl"
    示例 2:
输入: ["dog","racecar","car"]
输出: ""
    解释: 输入不存在公共前缀。
    说明:
所有输入只包含小写字母 a-z 。
 */
public class 最长公共前缀 {
    public static String longestCommon(String[] strs){
        //哈哈哎只会暴力,,希望后面多思考下吧
        if (strs.length==0||strs==null) return "";
        String res=strs[0];     //把第一个字符串当做最长公共
        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            for (; j < strs[i].length()&&j<res.length(); j++) {
                if (res.charAt(j)!=strs[i].charAt(j)){
                    break;
                }
            }
            res =res.substring(0,j);
            if (res.equals(""))return res;
        }
        return res;
    }


    //测试
    public static void main(String[] args) {
        String[] strs ={"abcd","abcdefg","abcnihai","ab"};
        System.out.println("longestCommon(strs) = " + longestCommon(strs));
    }
}
