package Factory.SimpleFactory;

public class TestFactory {
    public static void main(String[] args) {
        Wulincar wulincar = new Wulincar();
        DazhongCar dazhongCar = new DazhongCar();
        wulincar.name();
        dazhongCar.name();

        Car wulincar1 = CarFactory.getCar("Wulincar");
        wulincar1.name();
        Car 奔驰 = CarFactory.getCar("奔驰");
    }
}
