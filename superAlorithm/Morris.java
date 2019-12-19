package superAlorithm;

import com.sun.media.sound.RIFFInvalidDataException;
import sun.reflect.generics.tree.Tree;

import java.sql.SQLOutput;

public class Morris {
    /**
     * 二叉树神级遍历morris
     */
    public static void morris(Node head ){
        if (head == null ){
            return ;
        }
        Node cur =head;
        Node mostRight = null;
        while (cur != null){
            mostRight = cur.left;
            if (mostRight != null){             //如果有左子树
                while (mostRight.right!=null && mostRight != cur ){
                    mostRight = mostRight.right;
                }
                if (mostRight == null){
                    mostRight.right =cur;
                    cur =cur.left;
                    continue;
                }else{
                    mostRight.right =null;
                }
            }
            cur =cur.right;                     //没有左子树 ,或者左子树的最右子树的右孩子不为空
        }
    }


}
