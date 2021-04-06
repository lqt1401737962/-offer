package DFS;


import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/restore-ip-addresses/
 *
 * @author Qitong!!
 * @Date 2020/8/2
 */
//TODO: 待做利用DFS完成
public class _93_复原IP地址 {
    private int level =3;
    private List<String> res;
    private char[] chars;
    public List<String> restoreIpAddresses(String s) {
        res = new ArrayList<>();
        char[] chars = s.toCharArray();
        //排除没必要的搜索,长度大于12,和小于4都不合法
        if (chars.length< 4|| chars.length >12) return res;
        dfs(0,0,1);
        return res;
    }

    private void dfs(int i,int l ,int r) {
        if (i == level){

        }
    }

    private boolean isVail(char[] chars,int l ,int r){
        int len = r-l +1;
        int num =0;
        for (int i = 0; i < len; i++) {
            num = num*10 +chars[i] -'0';
        }
        if (num > 255)return false;
        return true;
    }
}
