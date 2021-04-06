package 串;

/**
 * https://leetcode-cn.com/problems/string-rotation-lcci/
 * @author  Qitong!!
 * @Date 2020/6/13
 */
public class 面试题01_09_字符串轮转 {
    /**
     * @Author Qitong~
     * @Description //TODO      输入：s1 = "waterbottle", s2 = "erbottlewat"
     *                           输出：True
     * @Date 16:18 2020/6/13
     * @Param [s1, s2]
     * @return boolean
     **/
    public boolean isFlipedString(String s1, String s2) {
        if (s1 == null || s2 == null) return false;
        if (s1.length() != s2.length()) return false;

        return (s1+s1).contains(s2);
    }
}
