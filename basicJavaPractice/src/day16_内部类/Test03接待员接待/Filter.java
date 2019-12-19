package day16_内部类.Test03接待员接待;

import day05_Math类.User;

/*
定义接口Filter：
    提供抽象方法filterUser（User u）
 */
public interface Filter {
    void  filterUser(User u);

    void filterUser();
}
