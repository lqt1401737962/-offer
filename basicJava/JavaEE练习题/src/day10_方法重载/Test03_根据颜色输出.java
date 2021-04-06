package day10_方法重载;

//定义showColor方法，根据英文单词，输出对应的颜色。
public class Test03_根据颜色输出 {
    public static void main(String[] args) {
        showColor("red");
        showColor("年后啊");
    }

    private static void showColor(String s) {
        switch (s) {
            case "red":
                System.out.println(s + "是红色");
                break;
            case "green":
                System.out.println(s + "是绿色");
                break;
            case "blue":
                System.out.println(s + "是蓝色");
                break;
            default:
                System.out.println("我不知道是什么颜色");
        }
    }
}
