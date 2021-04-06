package day02file类递归filefilter练习题;

import java.io.File;
import java.io.IOException;

/*
练习五:删除文件和文件夹
    描述:
        将D盘下a.txt文件删除
        将D盘下aaa文件夹删除,要求文件夹aaa是一个空文件夹。


 */
public class Test_03 {
    public static void main(String[] args) throws IOException {
        File file = new File("d:aaa\\bbb\\ccc.txt");

        file.delete();
    }
}
