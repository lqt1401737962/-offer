package day12_转换流和缓冲流;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
练习二:高效字节输出流写出字节数组数据
描述:利用高效字节输出流往C盘下的e.txt文件写出一个字节数组数据，如写出：”i love java”
    操作步骤:
        1.	创建字节输出流对象关联文件路径
        2.	利用字节输出流对象创建高效字节输出流对象
        3.	定义字符串存放要输出的数据，然后将字符串转换为字节数组。
        4.	调用高效字节输出流对象的write方法将字节数组输出。
        5.	关闭高效流。


 */
public class Test02_字节输出流 {
    public static void main(String[] args) throws IOException {
        //创建字符输出流
        FileOutputStream fos = new FileOutputStream("e://e.txt");
        //创建高效字符输出流
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        bos.write("I love java".getBytes());
        bos.close();
    }
}
