package Factory.AbstractFactory;

public class HuaweiRouter implements IRouterProduct {
    @Override
    public void start() {
        System.out.println("华为路由器开机");
    }

    @Override
    public void shutdown() {
        System.out.println("华为路由器关机");
    }

    @Override
    public void setting() {
        System.out.println("华为路由器设置参数");
    }

    @Override
    public void openWiFi() {
        System.out.println("华为路由器打开WiFi");
    }
}
