package day02file类递归filefilter练习题;

import java.io.File;

/*
描述:
    获取指定文件夹下所有的文件，并将所有文件的名字输出到控制台。
    注意：不包含子文件夹下的文件
操作步骤:
    1.	创建文件对象关联到指定文件夹，比如：c:/aaa
    2.	调用文件对象的listFiles方法获得文件数组
    3.	遍历文件数组将每一个文件的名字输出到控制台

 */
public class Test_06文件夹的获取方法 {
    public static void main(String[] args) {
        File file = new File("d:\\aaa");
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1.getName());
        }
    }
}
