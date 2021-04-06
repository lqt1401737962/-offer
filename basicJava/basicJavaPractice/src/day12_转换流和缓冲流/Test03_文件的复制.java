package day12_转换流和缓冲流;

import java.io.*;

/*
练习三:高效流文件复制
    描述:利用高效字节输入流和高效字节输出流完成文件的复制。
    要求：
        1.将C盘下的c.png文件复制到D盘下
        2.一次读写一个字节数组方式复制




7.	关闭高效流对象


 */
public class Test03_文件的复制 {
    public static void main(String[] args) throws IOException {
        //1.创建字节输入流对象并关联文件路径
        FileInputStream fis = new FileInputStream("D:\\随便写的\\Hebe_hsinchu_20151017.jpg");
        //2.利用字节输入流对象创建高效字节输入流对象
        BufferedInputStream bis = new BufferedInputStream(fis);
        //3.创建字节输出流对象并关联文件路径
        //4.	利用字节输出流对象创建高效字节输出流对象
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("e:\\Hebe_hsinchu_20151017.jpg"));
        //5.	创建字节数组用来存放读取的字节数
        byte[] bytes = new byte[1024];
        //6.利用高效字节输入流循环读取文件数据，每读取一个字节数组，
        // 利用高效字节输出流对象将字节数组的内容输出到目标文件中。
        // 直到读取到文件末尾。
        int len=-1;
        while ((len =bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }
        bis.close();
        bos.close();
    }
}
