package vivo;

import java.util.Arrays;

/**
 * @author Qitong!!
 * @Date 2020/9/12
 */
public class 编译依赖问题 {

    public String compileSeq(String input){
        String[] split = input.split(",");
        int[] ints = new int[split.length];
        //转换成int数组
        for (int i = 0; i < split.length; i++) {
            ints[i] = Integer.valueOf(split[i]);
        }

        int[] res = new int[ints.length];
        return Arrays.toString(res);

    }
}
