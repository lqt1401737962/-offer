package day23_字节字符流;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

//描述:利用字节输出流一次写一个字节数组的方式向D盘的b.txt文件输出内容:"i love java"。
public class Test02_字节输出流写数组 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("E:\\ddddemm\\b.txt");
        String s = "I love java";
        byte[] bytes = s.getBytes();
        fos.write(bytes);
        fos.close();
    }
}
