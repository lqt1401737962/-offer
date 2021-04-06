package 二刷;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**https://www.nowcoder.com/questionTerminal/00de97733b8e4f97a3fb5c680ee10720
 * @author Qitong!!
 * @Date 2020/7/22
 */
public class 剑指Offer_50_II字符流中只出现一次的字符 {
    private Map<Character,Boolean> hm= new HashMap<>();
    private List<Character> list = new ArrayList<>();
    public void insert(char ch){
        if (hm.containsKey(ch)){
            hm.put(ch,false);
        }else{
            hm.put(ch,true);
        }
        list.add(ch);
    }
    public char FirstAppearingOnce(){
        for (Character key : list) {
            if (hm.get(key)){
                return key;
            }
        }
        return '#';
    }

    public static void main(String[] args) {
        剑指Offer_50_II字符流中只出现一次的字符 o = new 剑指Offer_50_II字符流中只出现一次的字符();
        o.insert('g');
        o.insert('o');
        System.out.println(o.FirstAppearingOnce());
        o.insert('o');
        System.out.println(o.FirstAppearingOnce());
        o.insert('g');
        o.insert('l');
        System.out.println(o.FirstAppearingOnce());
        o.insert('e');

    }
}
