package day12_转换流和缓冲流;

import javax.xml.stream.events.StartDocument;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/*
练习四:高效字符流和集合的综合使用
描述:
分析以下需求，并用代码实现
	实现一个验证码小程序，要求如下：
	1. 在项目根目录下新建一个文件：data.txt,键盘录入3个字符串验证码，并存入data.txt中，
	    要求一个验证码占一行；
	2. 键盘录入一个需要被校验的验证码，如果输入的验证码在data.txt中存在：
	    在控制台提示验证成功，如果不存在控制台提示验证失败

 */
public class Test04_高效字符流和集合使用 {
    public static void main(String[] args) throws IOException {
        writeString2File();
        verifyCode();
    }

    private static void verifyCode() throws IOException {
        //创建ArrayList集合，用于存储文件中的3个验证码
        ArrayList<String> al = new ArrayList<>();
        //创建高效字符缓冲输入流对象,并和data.txt文件关联
        BufferedReader br = new BufferedReader(new FileReader("data.txt"));
        String line = null;
        while (null != (line = br.readLine())) {
            al.add(line);
        }
        br.close();
        Scanner sc = new Scanner(System.in);
        String code = sc.nextLine();
        if (al.contains(code)) {
            System.out.println("验证成功");
        } else {
            System.out.println("验证失败");
        }
    }

    private static void writeString2File() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(new File("data.txt")));
        String s = null;
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入第" + (i + 1) + "个验证码:");
            s = sc.nextLine();
            bw.write(s);
            bw.newLine();
        }
        bw.close();
    }
}
