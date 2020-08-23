package leetcode.DFS;

public class DFS_maxAreaIsland_695 {
/*[[0,0,1,0,0,0,0,1,0,0,0,0,0],
 [0,0,0,0,0,0,0,1,1,1,0,0,0],
 [0,1,1,0,1,0,0,0,0,0,0,0,0],
 [0,1,0,0,1,1,0,0,1,0,1,0,0],
 [0,1,0,0,1,1,0,0,1,1,1,0,0],
 [0,0,0,0,0,0,0,0,0,0,1,0,0],
 [0,0,0,0,0,0,0,1,1,1,0,0,0],
 [0,0,0,0,0,0,0,1,1,0,0,0,0]]
对于上面这个给定矩阵应返回 6。注意答案不应该是 11 ，因为岛屿只能包含水平或垂直的四个方向的 1 。
思路DFS
来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/max-area-of-island
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/

    private int m,n;
    private int[][]directions={{0,1},{0,-1},{1,0},{-1,0}};
    public int maxAreaOfIsland(int[][] grid) {
        if(grid==null|| grid.length==0){
            return 0;
        }
        m=grid.length;
        n=grid[0].length;
        int maxArea=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                maxArea=Math.max(maxArea,dfs(grid,i,j));
            }
        }
        return maxArea;
    }
    private int dfs(int[][] grid, int r, int c) {
        if (r < 0 || r >= m || c < 0 || c >= n || grid[r][c] == 0) {
            return 0;
        }
        grid[r][c] = 0;
        int area = 1;
        for (int[] d : directions) {
            area += dfs(grid, r + d[0], c + d[1]);
        }
        return area;
    }

    public static void main(String[] args) {

    }
}
