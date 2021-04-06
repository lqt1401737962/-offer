package day16_内部类.Test03接待员接待;

/*
定义接待员类：
    属性：接口Filter
    提供基本的构造方法和get方法，set方法
    成员方法：接待用户方法，设置用户类型。
 */
public class Reception {

    private Filter f;

    public Filter getF() {
        return f;
    }

    public void setF(Filter f) {
        this.f = f;
    }

    public void recept(User u) {
        if (u.getUserType() != null)
            return;
        if (f != null) {
            f.filterUser();
            return;
        } else {
            u.setUserType("A");
        }
    }
}
