package test;

/**
 * description
 *
 * @author qiton 2021/03/04 17:05
 */
public class _99乘法 {
    public static void main(String[] args) {
        printMulti(22);
    }
    
    private static void printMulti(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+"*"+i+"="+i*j+ " ");
            }
            System.out.println();
        }
    }
}
