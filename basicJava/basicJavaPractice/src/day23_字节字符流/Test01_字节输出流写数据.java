package day23_字节字符流;
//描述:利用字节输出流一次写一个字节的方式，向D盘的a.txt文件输出字符‘a’。

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01_字节输出流写数据 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("E:\\ddddemm\\a.txt");
        fos.write(97);
        fos.close();
    }
}
