package proxy.staticproxy;

public class Host implements Rent{
    @Override
    public void rent() {
        System.out.println("我是房屋 的主人,现在要出租房子了");
    }
}
