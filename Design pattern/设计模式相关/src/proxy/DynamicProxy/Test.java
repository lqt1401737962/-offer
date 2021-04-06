package proxy.DynamicProxy;

public class Test {
    public static void main(String[] args) {
        Host host = new Host();
        ProxyInvocationHandler pih = new ProxyInvocationHandler();

        //设置代理
        pih.setTarget(host);
        //动态生成代理类
        Rent res = (Rent) pih.getProxy();

        res.rent();
    }
}
