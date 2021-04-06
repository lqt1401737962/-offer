package 二刷;

/**
 * description
 *
 * @author qiton 2021/01/09 17:06
 */
public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        char[][] chars = new char[][]{{'a','a'}};
        System.out.println(test.exist(chars, "aaa"));
    }
    public boolean exist(char[][] board, String word) {
        if(board == null || board.length == 0) return false;
        char[] words = word.toCharArray();
        boolean[][]flag = new boolean[board.length][board[0].length];
        for(int i = 0; i< board.length ; i++){
            for(int j = 0;j < board[0].length ; j ++){
                if(dfs(board,words,i,j,0,flag)){
                    return true;
                }
            }
        }
        return false;

    }

    private boolean dfs (char[][] board,char[] words,int row ,int column, int index,boolean[][]flag ){
        if(row < 0|| row > board.length-1
                || column < 0 || column > board[0].length-1
                ||board[row][column] != words[index]
                ||flag[row][column]){
            return false;
        }
        if(words.length-1 == index){return true;}

        flag[row][column] = true;
        boolean res = dfs(board,words,row+1,column,index+1,flag) ||dfs(board,words,row-1,column,index+1,flag) ||dfs(board,words,row,column+1,index+1,flag) ||dfs(board,words,row,column-1,index+1,flag) ;
        flag[row][column] = false;
        return res;
    }

}
