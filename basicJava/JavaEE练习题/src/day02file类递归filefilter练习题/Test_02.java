package day02file类递归filefilter练习题;

import java.io.File;

//练习三:单级文件夹的创建
//描述:在D盘下创建一个名为bbb的文件夹。

public class Test_02 {
    public static void main(String[] args) {
        File f = new File("d:\\aaa\\bbb");
        boolean mkdir = f.mkdirs();
/*
    描述:在D盘下创建一个名为ccc的文件夹，要求如下：
    1.ccc文件夹中要求包含bbb子文件夹
    2.bbb子文件夹要求包含aaa文件夹
 */
        File files = new File("d:\\第一级\\第二集\\第三集");
        files.mkdirs();
    }
}
