package day23_字节字符流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/*
我有一个文本文件score.txt，我知道数据是键值对形式的，但是不知道内容是什么。
请写一个程序判断是否有"lisi"这样的键存在，如果有就改变其实为"100"
score.txt文件内容如下：
zhangsan = 90
lisi = 80
wangwu = 85

 */
public class Test08_IO和properties {
    public static void main(String[] args) throws IOException {
        //创建一个集合
        Properties prop = new Properties();
        //2:读取数据到集合中
        prop.load(new FileInputStream("E:\\ddddemm\\随便写的\\score.txt"));
        //3:遍历集合，获取到每一个key
        Set<String> keys = prop.stringPropertyNames();
        for (String key : keys) {
            //4:判断当前的key 是否为 "lisi"
            if ("lisi".equals(key)) {
                //把"lisi"的值设置为100
                prop.setProperty(key, "100");
            }
        }
        //把集合中所有的信息，重新存储到文件中
        prop.store(new FileOutputStream("E:\\ddddemm\\随便写的\\score.txt"), "haha");

    }
}
