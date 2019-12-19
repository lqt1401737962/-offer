package 汉诺塔;

public class Hanoi {
    int n;
    String a;
    String b;
    String c;

    public void solveHanoi(int n ,String a ,String b ,String c){
        if(n<1){
            System.out.println("可能错了数字");
        }
        else if (n== 1){
            System.out.println(a+">>"+c);
        }
        else{
            solveHanoi(n-1,a,c,b);
            System.out.println(a+">>"+c);
            solveHanoi(n-1,b,a,c);
        }
    }
}
