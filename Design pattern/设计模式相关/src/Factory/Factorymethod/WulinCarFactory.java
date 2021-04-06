package Factory.Factorymethod;

public class WulinCarFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new Wulincar();
    }
}
