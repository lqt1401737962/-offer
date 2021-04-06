package Factory.Factorymethod;

public class DazhongCarFactory implements CarFactory {

    @Override
    public Car getCar() {
        return new DazhongCar();
    }
}
