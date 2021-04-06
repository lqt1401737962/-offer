package day13_继承和抽象类;
//定义汽车Auto类
//    属性：品牌，车长，价格
public class Auto {
    private String brand;
    private int size;
    private double price;

    public Auto() {
    }
    public Auto(String brand, int size, double price) {
        this.brand = brand;
        this.size = size;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public  void showMsg(){
        System.out.println("品牌:"+brand);
        System.out.println("车长:"+size);
        System.out.println("价格:"+price);
    }

}
