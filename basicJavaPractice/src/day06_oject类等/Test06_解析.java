package day06_oject类等;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
六、使用SimpleDateFormat类,把2018-03-04转换为2018年03月04日。
 */
public class Test06_解析 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy:MM:dd");

        Date date = sdf.parse("2019:06:07");
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日");
        String format = sdf1.format(date);
        System.out.println(format);
    }
}
