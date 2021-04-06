package day01集合练习;

import java.util.ArrayList;

/*
三、定义一个方法，要求此方法把int数组转成存有相同元素的集合(集合里面的元素是Integer)，并返回。()
 */
/*
     分析1.int[]遍历
      2.创建一个 集合ArrayList 并把数组数添加到集合中;
 */
public class Test3_Collection集合数组转集合 {
    public static void main(String[] args) {
        int[] array = {1, 23, 4, 5, 6, 7, 7};
        ArrayList<Integer> transform = transform(array);
        System.out.println(transform);

    }

    /*
    返回值类型    ArrayList
    名称         transform
    参数列表      array
     */
    public static ArrayList<Integer> transform(int[] array) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            arrayList.add(array[i]);
        }
        return arrayList;

    }
}
