package Factory.AbstractFactory;

public class XiaomiFactory implements ProductFactory {

    @Override
    public IPhoneProduct iPhoneProduct() {
        return new XiaomiIphone();
    }

    @Override
    public IRouterProduct iRouterProduct() {
        return new XiaomiIRouter();
    }
}
