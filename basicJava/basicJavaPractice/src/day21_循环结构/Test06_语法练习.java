package day21_循环结构;

import javax.sound.midi.Soundbank;

/*
定义类 Test6
定义 main方法
定义字符串遍历 str,赋值为J
使用for循环,初始化变量i = 0,如果i<5进入循环,步进表达式i++
for循环内部,嵌套定义变量key ,赋值为i%3;
定义switch语句 ,表达式为key.
case 为0时,str拼接字符'a',i++后,break
case 为2时,str拼接字符'V'
循环结束后,输出str
 */
public class Test06_语法练习 {
    public static void main(String[] args) {
        String str="J";
        for (int i =0;i<5;i++){
            int key=i%3;
            switch (key){
                case 0:str=str+"a";
                i++;
                break;
                case 2:str=str+"V";
                break;
            }
        }
        System.out.println(str);
    }
}
