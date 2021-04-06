package day20_线程池;

/*
问题：
	给定一个导演 Director接口，内含唯一的抽象方法makeMovie，
	且无参数、无返回值，使用lambda表达式在Test中完成调用。

	在下面的代码中，请使用Lambda的省略格式调用 invokeDirect 方法，
	打印输出“导演拍电影啦！”字样：

 */
public class Test09_lambda练习 {
    public static void main(String[] args) {
        invokeDirect(() -> System.out.println("导演拍电影啦!"));
    }

    private static void invokeDirect(Director director) {
        director.makeMovie();
    }
}
