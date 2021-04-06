package Factory.AbstractFactory;

public interface ProductFactory  {
    //生产手机
    IPhoneProduct iPhoneProduct();
    //生产路由器
    IRouterProduct iRouterProduct();

}
