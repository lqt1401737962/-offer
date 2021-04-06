package Factory.Factorymethod;

public class TestMethod {
    public static void main(String[] args) {
        Car wulin = new WulinCarFactory().getCar();
        Car dazhong = new DazhongCarFactory().getCar();
        wulin.name();
        dazhong.name();

        //加了一个奔驰汽车
        Car benchi = new BenchiCarFactory().getCar();
        benchi.name();
    }
}
