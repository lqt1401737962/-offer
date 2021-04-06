package day13_继承和抽象类;

/*
定义SUV继承Auto类
    属性：小型车车长标准值：4295，中型车车长标准值：5070。
    定义判断车型方法
    判断小型车：小于小型车车长标准值
    判断大型车：大于中型车车长标准值
    判断中型车：大于小型车车长标准值并且小于等于中型车车长标准值
 */
public class SUV extends Auto {
    private int miniLength = 4295;
    private int midLength = 5070;

    public SUV(int size, double price) {
        super("SUV", size, price);
    }

    //判断小型车
    public boolean miniSUV() {
        return getSize() <= miniLength;
    }

    //判断中型车
    public boolean midSUV() {
        return getSize() > miniLength && getSize() <= midLength;
    }

    //判断大型车
    public boolean bigSUV() {
        return getSize() > midLength;
    }
}
