package Factory.AbstractFactory;

public class HuaweiFactory  implements  ProductFactory{

    @Override
    public IPhoneProduct iPhoneProduct() {
        return new HuaweiIpone();
    }

    @Override
    public IRouterProduct iRouterProduct() {
        return new HuaweiRouter();
    }
}
