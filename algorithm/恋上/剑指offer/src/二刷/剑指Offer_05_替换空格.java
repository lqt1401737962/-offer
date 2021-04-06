package 二刷;

/**
 * https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof/
 *
 * @author Qitong!!
 * @Date 2020/6/30
 */
public class 剑指Offer_05_替换空格 {
    //调用系统自带的函数 时间特别长!不好
    public String replaceSpace(String s) {
        if (s == null) return null;
        return s.replaceAll(" ", "\\%20");
    }

    public String replaceSpace2(String s) {
        if (s == null) return null;
        char[] chars = s.toCharArray();
        //记录有多少个空格
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                count++;
            }
        }
        //要加 括号 ,不然就是(chars,length+count) << 1  会很大
        char[] res = new char[chars.length + (count << 1)];

        for (int i = 0, cur = 0; i < chars.length; i++) {
            if (chars[i] != ' ') {
                res[cur++] = chars[i];
            } else {
                res[cur++] = '%';
                res[cur++] = '2';
                res[cur++] = '0';
            }
        }
        return String.valueOf(res);
    }

    public static void main(String[] args) {
        System.out.println(4<<1 + 5);
        System.out.println(4 << 6);
    }
}
