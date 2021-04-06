package 哔哩哔哩;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Qitong!!
 * @Date 2020/8/13
 */
public class 算24点 {
    //TODO: 利用加减乘除 获得24点
    private final char[] opera= {'+','-','*','/'};
    private List<List<String>> list;
    private List<String> res;
    private int[] arr;
    public boolean Game24Points(int[] arr){
        if (arr.length != 4) return false;
        this.arr = arr;
        list = new ArrayList<>();
        res = new ArrayList<>();
        dfs(0);
        //得到所有的情况的集合
        for (List<String> strings : list) {
            //每一种情况进行判断

        }
        //如果没有命中,则返回 fasle;
        return false;
    }
    private void dfs(int index) {
        //到
        if (index == 4){
            list.add(new ArrayList<>(res));
            return ;
        }
        //我感觉是枚举所有的情况~在计算每个情况的值然后判断

        //枚举所有情况进集合
        for (int i = 0; i < arr.length; i++) {
            res.add(String.valueOf(arr[i]));
            for (int j = 0; j < opera.length; j++) {
                res.add(String.valueOf(opera[i]));
                dfs(index+1);
            }
        }
    }


}
