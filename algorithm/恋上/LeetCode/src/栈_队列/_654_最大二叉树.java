package 栈_队列;
import common.TreeNode;
import java.util.Stack;

/**
 * https://leetcode-cn.com/problems/maximum-binary-tree/
 * @author Qitong!!
 * @Date 2020/6/12
 */
public class _654_最大二叉树 {

    /**
     * @Author Qitong~
     * @Description //TODO 返回一个数组，数组里面存着每个节点的父节点的索引（如果没有父节点，就存 ）
     *                      是最大二叉树的变种题目!!!很重要
     * @Date 18:14 2020/6/12
     * @Param [nums]
     * @return int[]
     **/
    //变种题!!  求左右两边第一个比他大或者 比他小的值!
    public int[] parentIndexes(int[] nums) {
        if (nums == null || nums.length <1)return null;

        /*
         * 1.扫描一遍所有的元素
         * 2.保持栈从栈底到栈顶是单调递减的
         */
        int[] ris = new int[nums.length];
        int[] lis = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        //初始化!
        for (int i = 0; i < nums.length; i++) {
            ris[i] = -1;
            lis[i] = -1;
        }
        for (int i = 0; i < nums.length; i++) {
            while (!stack.isEmpty() && nums[stack.peek()]< nums[i]){
                ris[stack.pop()] = i;
            }
            if (!stack.isEmpty()){
                lis[stack.peek()] = i;
            }
            stack.push(i);
        }
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (lis[i] == -1 && ris[i]==-1){
                //那么 就位根节点的位置
                res[i] = -1;
                continue;
            }
            if(lis[i] == -1 ){
                res[i] = ris[i];
            }else if (ris[i] == -1 ){
                res[i] = lis[i];
            }else if(nums[lis[i]] > nums[ris[i]]){
                res[i] = ris[i];
            }else{
                res[i] = lis[i];
            }
        }
        return res;
    }


    /**
     * @Author Qitong~
     * @Description //TODO 给定一个不含重复元素的整数数组。一个以此数组构建的最大二叉树定义如下：
     *                      二叉树的根是数组中的最大元素。
     *                  左子树是通过数组中最大值左边部分构造出的最大二叉树。
     *                  右子树是通过数组中最大值右边部分构造出的最大二叉树。
     *                  通过给定的数组构建最大二叉树，并且输出这个树的根节点。
     * @Date 17:51 2020/6/12
     * @Param [nums]
     * @return common.TreeNode
     **/
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums == null|| nums.length <1) return null;
        TreeNode root = findRoot(0, nums.length, nums);
        return  root;
    }
    //找到[l,r) 根结点的范围
    private TreeNode findRoot(int l, int r, int[] nums){
        if (l >= r){return null;}
        int maxIndex = l;
        for (int i = l+1; i < r; i++) {
            if (nums[maxIndex] < nums[i]) maxIndex = i;
        }
        TreeNode root = new TreeNode(nums[maxIndex]);
        root.left = findRoot(l,maxIndex,nums);
        root.right = findRoot(maxIndex+1,r,nums);

        return root;
    }
}
