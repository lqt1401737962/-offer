package day23_字节字符流;

import javax.sound.sampled.Line;
import java.io.FileOutputStream;
import java.io.IOException;

/*
描述:在D盘下，有一c.txt 文件中内容为：HelloWorld
在c.txt文件原内容基础上，添加五句 I love java，而且要实现一句一行操作(注：原文不可覆盖)。
利用字节输出流对象往C盘下c.txt文件输出5句：”i love java”

 */
public class Test03_文件续写和换行输出 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("E:\\ddddemm\\c.txt", true);
        String s = "I love java\r\n";
        for (int i = 0; i < 5; i++) {
            fos.write(s.getBytes());
        }
        fos.close();
    }
}
