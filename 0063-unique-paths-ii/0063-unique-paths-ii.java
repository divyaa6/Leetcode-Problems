class Solution {
    int m,n;
    public int f(int i,int j,int[][] obs,int[][] dp){
        if(i==m-1 && j==n-1 && obs[i][j]!=1)
        return 1;

        if(i>=m || j>=n)
        return 0;

        if(dp[i][j]!=-1)
        return dp[i][j];

        if(obs[i][j]==1)
        return 0;

        return dp[i][j]=f(i+1,j,obs,dp)+f(i,j+1,obs,dp);       
    }


    public int uniquePathsWithObstacles(int[][] obs) {
        m=obs.length;
        n=obs[0].length;
        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++)
        Arrays.fill(dp[i],-1);
        return f(0,0,obs,dp);
        
    }
}