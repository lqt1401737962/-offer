package day23_字节字符流;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//项目需求：请用户从控制台输入信息，程序将信息存储到文件Info.txt中。可以输入多条信息，每条信息存储一行。当用户输入：”886”时，程序结束。
//答案
public class Test07_字符输入流写 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("E:\\ddddemm\\随便写的\\info.txt",true);
        Scanner sc =new Scanner(System.in);

        while (true){
            System.out.println("请随便输入:");
            String s = sc.nextLine();
            if(s.equals("888")){
                break;
            }
            fw.write(s);
        }
        fw.close();
    }
}
