package day15_描述类;
/*
定义一个日期MyDate类。

构造方法：
满参构造方法
成员方法：
get/set方法

 */
public class MyDate {
    //属性：
    private int year;//year：年
    private int month;//month：月
    private int day;//day：日

    public MyDate() {
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
    //showDate方法：打印日期。
    //isBi方法：判断当前日期是否是闰年
    public void showDate(){
        System.out.println(year+"年"+month+"月"+day+"日");
    }
    public boolean isBi(){
        if (year%4==0)return true;
        else return false;
    }
}
