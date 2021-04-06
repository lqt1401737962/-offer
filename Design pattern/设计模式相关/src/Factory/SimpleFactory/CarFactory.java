package Factory.SimpleFactory;

public class CarFactory {
    //汽车的工厂
    public static Car getCar(String carName){
        if (carName.equals("Wulincar")){
            return new Wulincar();
        }else if (carName.equals("DazhongCar")){
            return new DazhongCar();
        }else{
            throw new RuntimeException("你要的车我们不会生产");
        }
    }
}
