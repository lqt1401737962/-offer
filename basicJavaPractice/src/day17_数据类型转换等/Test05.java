package day17_数据类型转换等;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.awt.geom.FlatteningPathIterator;

/*
定义类 Test5
定义 main方法
定义一个int类型变量a,变量b,都赋值为20.
定义boolean类型变量bo , 判断a 是否被3整除,并且a 是否被7整除,将结果赋值给bo
输出a的值,bo的值.
定义boolean类型变量bo2 , 判断b++ 是否被3整除,并且++b 是否被7整除,将结果赋值给bo2
输出b的值,bo2的值.
 */
public class Test05 {
    public static void main(String[] args) {
        int a =20;
        int b =20;
        boolean bo=++a%3==0&&a++%7==0;
        boolean bo2=b++%3==0&&++b%7==0;
        System.out.println(bo);
        System.out.println(bo2);
    }
}
