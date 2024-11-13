class Solution {
    int m,n;
    public int f(int i,int j,int[][] grid,int[][] dp){
        if(i==m-1 && j==n-1)
        return grid[i][j];

        if(i>=m || j>=n)
        return (int) Math.pow(10, 9);

        if(dp[i][j]!=-1)
        return dp[i][j];

        int r=grid[i][j]+f(i+1,j,grid,dp);
        int d=grid[i][j]+f(i,j+1,grid,dp);

        return dp[i][j]=Math.min(r,d);

    }
    public int minPathSum(int[][] grid) {
        m=grid.length;
        n=grid[0].length;

        int[][] dp=new int[m+1][n+1];

        for(int i=0;i<m;i++)
        Arrays.fill(dp[i],-1);

        return f(0,0,grid,dp);
        
    }
}