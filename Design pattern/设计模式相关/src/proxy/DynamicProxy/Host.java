package proxy.DynamicProxy;

public class Host implements Rent {

    @Override
    public void rent() {
        System.out.println("我是房主要租房子");
    }
}
