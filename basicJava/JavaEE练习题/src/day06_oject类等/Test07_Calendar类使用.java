package day06_oject类等;

import java.util.Calendar;

//七、用程序判断2018年2月14日是星期几。
public class Test07_Calendar类使用 {
    public static void main(String[] args) {
        //创建calendar类
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2019);
        cal.set(Calendar.MONTH, 10);
        cal.set(Calendar.DATE, 19);

        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        int date = cal.get(Calendar.DATE);

        char week = getWeek(cal.get(Calendar.DAY_OF_WEEK));
        System.out.println(year + "年" + month + "月" + date + "日" + "星期" + week);
    }

    private static char getWeek(int i) {
        char[] c = {' ', '日', '一', '二', '三', '四', '五', '六'};
        return c[i];
    }
}
