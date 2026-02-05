class Solution {
    int count;
    public int uniquePaths(int m, int n) {
        count = 0;
        int grid[][] = new int[m][n];
        int dp[][] = new int [m][n];
        for(int i = 0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(0,0,grid,dp);
    }
    public int solve(int x, int y, int grid [][], int [][]dp){
        if(x == grid.length-1 && y == grid[0].length-1){
            return 1;
        }
        if(x > grid.length-1 || y > grid[0].length-1){
            return 0;
        }
        if(dp[x][y] != -1){
            return dp[x][y];
        }

       return dp[x][y] = solve(x+1,y,grid,dp) + solve(x,y+1,grid,dp);
    }
}