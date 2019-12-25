package day02;

import java.util.jar.JarEntry;

/*
对于一个给定的 source 字符串和一个 target 字符串，
        你应该在 source 字符串中找出 target 字符串
        出现的第一个位置(从0开始)。
        如果不存在，则返回 -1。
 */
public class 一个包含另一个 {
    public static void main(String[] args) {
        int qiqi = findIndex("nishisheiwodeqiqi,nihaoaqiqi", "qiqi");
        System.out.println(qiqi);
    }

    public static int findIndex(String source, String target) {
        if (source == null || target == null || (source.length() < target.length())) {
            return -1;
        }
        for (int i = 0; i < source.length() - target.length() + 1; i++) {
            int j = 0;
            for (j = 0; j < target.length(); j++) {
                if (source.charAt(i + j) != target.charAt(j)) {
                    break;
                }
            }
            if (target.length() == j) {
                return i;
            }
        }

        return -1;
    }
}
