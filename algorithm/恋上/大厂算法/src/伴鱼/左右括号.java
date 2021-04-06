package 伴鱼;

/**
 * @author Qitong!!
 * @Date 2020/9/17
 */
public class 左右括号 {
    public int minInsertions(String s){

        int ans = 0, left = 0, n = s.length();
        for (int i = 0; i < n; ++i) {
            // 左括号次数
            if (s.charAt(i) == '(') ++left;
            else {
                // 找第二个右括号
                if (i+1 < n && s.charAt(i+1)== ')') {
                    ++i;
                } else { // 缺少第二个右括号就添加一个
                    ++ans;
                }
                // 两个右括号匹配一个左括号
                if (left > 0){
                    --left;
                }  else{
                    // 缺少左括号就添加一个
                    ++ans;
                }
            }
        }
        // 多出的左括号都匹配两个右括号
        ans += left * 2;
        return ans;

    }
}
