package 哔哩哔哩;

/**
 * @author Qitong!!
 * @Date 2020/8/13
 */
public class 得到最少的硬币数 {

    //TODO: 得到最少的硬币个数
    public int GetCoinCount(int N){
        //因为有1024 N为消费的钱数
        //剩余,即应该找回的钱数
        int remain =1024 -N;
        if (remain <= 0) return 0;
        //贪心,count 记录答案
        int count = 0;
        while (remain > 0){
            if (remain >=64){
                count += remain/64;
                remain %=64;
            }else if(remain >= 16) {
                count += remain / 16;
                remain %= 16;
            }else if(remain >= 4 ){
                count += remain /4;
                remain %=4;
            }else{
                count += remain ;
            }
        }
        return count;
    }
}
