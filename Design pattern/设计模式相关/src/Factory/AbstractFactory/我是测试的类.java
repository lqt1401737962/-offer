package Factory.AbstractFactory;

public class 我是测试的类 {
    public static void main(String[] args) {
        //测试小米
        XiaomiFactory xiaomiFactory = new XiaomiFactory();
        IPhoneProduct xiaoIphone = xiaomiFactory.iPhoneProduct();
        IRouterProduct xiaoRouter = xiaomiFactory.iRouterProduct();
        xiaoIphone.start();
        xiaoRouter.shutdown();


        //测试华为
        HuaweiFactory huaweiFactory = new HuaweiFactory();
        huaweiFactory.iPhoneProduct().sendMsg();
        huaweiFactory.iRouterProduct().openWiFi();

    }
}
