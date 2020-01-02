package leetcode;
/*
给定一个正整数，返回它在 Excel 表中相对应的列名称。
例如，
    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB
    ...
示例 1:
    输入: 1
    输出: "A"
示例 2:
    输入: 28
    输出: "AB"
示例 3:
    输入: 701
    输出: "ZY"
 */
public class Excel表列名称 {
    public String convertToTitle(int n) {
        StringBuilder res =new StringBuilder();
        while (n> 0){
            int x = n%26;
            if (x == 0){
                x=26;
                n -=1;
            }
            char c =(char)(x+'A'-1);
            res.append(c);
            n /= 26;
        }
        return res.reverse().toString();
    }
}
