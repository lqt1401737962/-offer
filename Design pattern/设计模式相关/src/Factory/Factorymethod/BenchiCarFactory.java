package Factory.Factorymethod;

public class BenchiCarFactory implements CarFactory{
    @Override
    public Car getCar() {
        return new BenchiCar();
    }
}
