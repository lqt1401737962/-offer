package day23_字节字符流;

import java.io.FileInputStream;
import java.io.IOException;

/*
描述:利用字节输入流读取D盘文件b.txt的内容，文件内容确定都为纯ASCII字符
,使用循环读取，一次读取一个字节数组，直到读取到文件末尾，将读取到的字节数组转换成字符串输出到控制台。
答案

 */
public class Test05_字节输入流一次读取一个数组 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("e:\\ddddemm\\c.txt");
        byte[] bytes=new byte[1024];
        int len =-1;
        while ((len=fis.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
        fis.close();
    }
}
