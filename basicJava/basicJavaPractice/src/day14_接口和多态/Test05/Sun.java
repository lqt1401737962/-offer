package day14_接口和多态.Test05;
//定义普通类Sun，继承Star类，实现Universe接口
public class Sun extends Star implements Universe{

    @Override
    public void doAnything() {
        System.out.println("我就是万物之神太阳太阳");
    }
}
