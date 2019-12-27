package leetcode;

import java.util.ArrayList;
import java.util.List;

/*
Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.
In Pascal's triangle, each number is the sum of the two numbers directly above it.
Example:
Input: 5
Output:
    [
         [1],
        [1,1],
       [1,2,1],
      [1,3,3,1],
     [1,4,6,4,1]
    ]
 */
public class Pascal_sTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        for(int i =1; i<= numRows ; i++){
            List<Integer> temp =new ArrayList<Integer>();
            if(i <=2){
                for(int j =1;j <=i;j++){
                    temp.add(1);
                }
                res.add(temp);
            }else{
                temp.add(1);
                for(int j=2;j < i;j++){
                    Integer twosum = res.get(i-2).get(j-1)+res.get(i-2).get(j-2);
                    temp.add(twosum);
                }
                temp.add(1);
                res.add(temp);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println("generate(5) = " + generate(5));
    }
}
