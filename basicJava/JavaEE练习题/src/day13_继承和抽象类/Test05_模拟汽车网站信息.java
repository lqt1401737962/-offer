package day13_继承和抽象类;

import java.util.ArrayList;

/*
模拟汽车网站信息。


    测试类中，创建若干SUV对象，保存到集合，遍历集合，输出中型SUV。
 */
public class Test05_模拟汽车网站信息 {
    public static void main(String[] args) {
        ArrayList<SUV> suvs = new ArrayList<>();
        SUV suv1 = new SUV(5079, 750000);
        SUV suv2 = new SUV(4813, 760000);
        SUV suv3 = new SUV(4270, 127800);
        SUV suv4 = new SUV(4545, 188800);
        suvs.add(suv1);
        suvs.add(suv2);
        suvs.add(suv3);
        suvs.add(suv4);
        for (int i = 0; i < suvs.size(); i++) {
            SUV suv = suvs.get(i);
            if (suv.midSUV()) {
                suv.showMsg();
            }
        }
    }
}
