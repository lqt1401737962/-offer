package day22_异常线程同步;
/*
3.定义测试类Test9
 a)提供main方法,在main方法中
  i.使用满参构造方法创建Student对象,分数传入一个负数,运行程序
  ii.由于一旦遇到异常,后面的代码的将不在执行,所以需要注释掉上面的代码
  iii.使用空参构造创建Student对象
  iv.调用setScore(int score)方法,传入一个正数,运行程序
  v.调用setScore(int score)方法,传入一个负数,运行程序

 */
public class Test08_自定义异常类 {
    public static void main(String[] args) {
//        Student 张三 = new Student("张三", -234);
//        System.out.println(张三);
        Student s = new Student();
        s.setScore(-8);
        s.setName("骐通");
    }
}
