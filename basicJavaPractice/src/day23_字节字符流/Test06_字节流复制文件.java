package day23_字节字符流;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
述:利用字节流将E盘下的a.png图片复制到D盘下(文件名保存一致)
要求：
一次读写一个字节的方式

 */
public class Test06_字节流复制文件 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("E:\\ddddemm\\IM.JPG");
        FileOutputStream fos = new FileOutputStream("E:\\ddddemm\\随便写的\\IM.JPG");
        int len =-1;
        while ((len=fis.read())!=-1){
            fos.write(len);
        }
        fis.close();
        fos.close();
    }
}
