package proxy.dynamicagain;

public class ServiceImp implements Service {

    @Override
    public void add() {
        System.out.println("增加了一个用户");
    }

    @Override
    public void remove() {
        System.out.println("删除了一个用户");
    }

    @Override
    public void update() {
        System.out.println("跟新了用户的信息");
    }

    @Override
    public void query() {
        System.out.println("查询了一个用户");
    }
}
