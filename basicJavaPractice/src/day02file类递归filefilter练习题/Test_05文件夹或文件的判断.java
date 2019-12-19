package day02file类递归filefilter练习题;

import java.io.File;

/*
描述:
    1.判断File对象是否是文件,是文件则输出：xxx是一个文件，否则输出：xxx不是一个文件。
    2.判断File对象是否是文件夹,是文件夹则输出：xxx是一个文件夹，
      否则输出：xxx不是一个文件夹。(xxx是文件名或文件夹名)

 */
public class Test_05文件夹或文件的判断 {
    public static void main(String[] args) {
        File f1 = new File("d:\\aaa\\bbb");
        File f2 = new File("d:\\aaa\\b.txt");
        if (f2.isFile()) {
            System.out.println(f2.getName()+"是一个文件");
        }else{
            System.out.println(f2.getName()+"不是一个文件");
        }

        if (f1.isDirectory()){
            System.out.println(f1.getName()+"是一个文件夹");
        }else{
            System.out.println(f1.getName()+"不是一个文件夹");
        }

    }
}
