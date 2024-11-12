class Solution {
     int M,N;

	public  int f(int i,int j,int dp[][]){
		if(i==M-1 && j==N-1)
		return 1;

		if(i>=M || j>=N)
		return 0;

		if(dp[i][j]!=-1)
		return dp[i][j];

		return dp[i][j]=f(i+1,j,dp)+f(i,j+1,dp);
	}
    public int uniquePaths(int m, int n) {
        M=m;
		N=n;
		int[][] dp=new int[m][n];
		for(int i=0;i<m;i++)
		Arrays.fill(dp[i],-1);
		return f(0,0,dp);
        
    }
}