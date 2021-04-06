package day02file类递归filefilter练习题;

import java.io.File;
import java.io.IOException;

/*
练习一:相对路径和绝对路径的使用
描述:创建两个文件对象，分别使用相对路径和绝对路径创建。
练习二:
描述:检查D盘下是否存在文件a.txt,如果不存在则创建该文件
 */
public class Test_01 {
    public static void main(String[] args) throws IOException {
        //绝对路径创建
        File file = new File("E:\\骐通啊用的文件\\aaa.txt");
        //相对路径创建
        File file1 = new File("E:\\bbb.txt");
        //描述:检查D盘下是否存在文件a.txt,如果不存在则创建该文件
        if (!file.exists()) {
            file.createNewFile();

        }
    }
}
