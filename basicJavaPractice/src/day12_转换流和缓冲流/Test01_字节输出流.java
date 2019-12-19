package day12_转换流和缓冲流;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
练习一:高效字节输出流写出字节数据
描述:利用高效字节输出流往C盘下的d.txt文件输出一个字节数。
    操作步骤:
        1.	创建字节输出流对象关联文件路径
        2.	利用字节输出流对象创建高效字节输出流对象
        3.	调用高效字节输出流对象的write方法写出一个字节
        4.	关闭高效流，释放资源。

 */
public class Test01_字节输出流 {
    public static void main(String[] args) throws IOException {
        //创建字符输出流
        FileOutputStream fos = new FileOutputStream("e://e.txt");
        //创建高效字符输出流
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        bos.write(97);
        bos.close();
    }
}
