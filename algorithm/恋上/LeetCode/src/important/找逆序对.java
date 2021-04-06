package important;

/**
 * @author Qitong!!
 * @Date 2020/6/29
 */
public class 找逆序对 {
    public void findInversePairs(int[] array){
        //找到右边最后一个逆序对
        int r = -1;
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] >= max){
                max = array[i];
            }else{
                r = i;
            }
        }
        //找到左边最后一个逆序对
        int l = -1;
        int min = array[array.length-1];
        for (int i = array.length-2; i >=0; i--) {
            if (array[i] <= min){
                min = array[i];
            }else{
                l = i;
            }
        }
    }
}
