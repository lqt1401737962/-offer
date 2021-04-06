package day05_Math类;

import java.util.ArrayList;
import java.util.Scanner;

/*
模拟用户登录。
    定义用户类，属性为用户名和密码。
    使用集合存储多个用户对象。
    录入用户和密码，对比用户信息，匹配成功登录成功，否则登录失败。
    登录失败时，当用户名错误，提示没有该用户。
    登录失败时，当密码错误时，提示密码有误。
 */
public class Test10_用户登录 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.nextLine();
        System.out.println("请输入密码");
        String password = sc.nextLine();
        User user = new User(username, password);

    }

    static String login(User user) {
        ArrayList<User> list = new ArrayList<>();
        list.add(new User("jack", "1234"));
        list.add(new User("rose", "5678"));
        list.add(new User("tom", "0000"));
        String password = user.getPassword();
        String username = user.getUsername();
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
        return null;
    }
}
