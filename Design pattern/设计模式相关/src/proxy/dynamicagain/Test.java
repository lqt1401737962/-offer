package proxy.dynamicagain;

public class Test {
    public static  void main(String[] args) {
        //测试动态代理
        //真实对象
        ServiceImp serviceImp = new ServiceImp();
        //活得动态代理的调用程序
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        //设置代理的对象
        pih.setObj(serviceImp);
        //活得动态代理
        Service proxy = (Service) pih.getProxy();
        proxy.update();
    }
}
