package day16_内部类.Test03接待员接待;

/*
定义用户类：
    属性：用户类型，用户id
    提供基本的构造方法和get方法，set方法
 */
public class User {
    private String userType;
    private String id;

    public User() {
    }

    public User(String userType, String id) {
        this.userType = userType;
        this.id = id;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
