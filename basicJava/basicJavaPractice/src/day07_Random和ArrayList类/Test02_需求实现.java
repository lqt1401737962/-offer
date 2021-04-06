package day07_Random和ArrayList类;

import java.util.ArrayList;
import java.util.Scanner;

/*
    键盘录入学生信息，保存到集合中。
        循环录入的方式，1：表示继续录入，0：表示结束录入。
        定义学生类，属性为姓名，年龄，使用学生对象保存录入数据。
        使用ArrayList集合，保存学生对象，录入结束后，遍历集合。
 */
public class Test02_需求实现 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner sc =new Scanner(System.in);
        while (true) {
            System.out.println("1.录入信息 0.退出");
            int i = sc.nextInt();
            switch (i) {
                case 1:
                    inputStu(students,sc);
                    break;
                case 0:
                    System.out.println("录入完毕");
            }
        }
        }
        private static void inputStu(ArrayList<Student>  arrayList,Scanner scanner){
            System.out.println("请输入姓名:");
            String s = scanner.nextLine();
            System.out.println("请输入年龄:");
            int i = scanner.nextInt();
            arrayList.add(new Student(s,i));
        }

}
