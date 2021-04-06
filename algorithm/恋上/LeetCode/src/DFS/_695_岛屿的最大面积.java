package DFS;

/**https://leetcode-cn.com/problems/max-area-of-island/
 * @author Qitong!!
 * @Date 2020/8/2
 */
public class _695_岛屿的最大面积 {
    public int maxAreaOfIsland(int[][] grid) {
        if (grid == null || grid.length == 0) return 0;
        //可以拷贝一份原数组! 不修改原数组 或者创建一个标记数组boolean[][]
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1){
                    res =Math.max(res,dfs(grid,i,j));
                }
            }
        }
        return res;
    }

    private int dfs(int[][] grid, int i, int j) {
        if (i <0 || i>=grid.length|| j<0||j>=grid[i].length||grid[i][j]==0)return 0;
        //标记来过
        grid[i][j] =0;
        int count =1;
        count +=dfs(grid,i+1,j);
        count +=dfs(grid,i-1,j);
        count +=dfs(grid,i,j-1);
        count +=dfs(grid,i,j+1);
        return count;
    }
}
