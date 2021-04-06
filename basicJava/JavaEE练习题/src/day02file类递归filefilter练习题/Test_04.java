package day02file类递归filefilter练习题;

import java.io.File;

/*
描述:
    获取D盘aaa文件夹中b.txt文件的文件名，文件大小，文件的绝对路径和父路径等信息，并将信息输出在控制台。

 */
public class Test_04 {
    public static void main(String[] args) {
        File file = new File("d:aaa\\b.txt");
        String name = file.getName();
        String absolutePath = file.getAbsolutePath();
        long length = file.length();
        String parent = file.getParent();
        System.out.println("file的名字是:" + name);
        System.out.println("file的绝对路径是:" + absolutePath);
        System.out.println("file的大小是:" + length);
        System.out.println("file的父路径是:" + parent);
    }
}
