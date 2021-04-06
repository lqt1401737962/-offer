package Factory.AbstractFactory;

import javax.sound.midi.Soundbank;

public class XiaomiIphone implements IPhoneProduct {

    @Override
    public void start() {
        System.out.println( "小米手机开机");
    }

    @Override
    public void shutdown() {
        System.out.println("小米手机关机");
    }

    @Override
    public void callup() {
        System.out.println("小米手机打电话");
    }

    @Override
    public void sendMsg() {
        System.out.println("小米手机发短信");
    }
}
