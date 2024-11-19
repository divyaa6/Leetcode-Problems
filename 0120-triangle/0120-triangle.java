class Solution {
    public int f(int i,int j,List<List<Integer>> triangle,int n,int[][] dp){
        if(i==n-1)
        return triangle.get(i).get(j);

        if(dp[i][j]!=-1)
        return dp[i][j];

        int d=triangle.get(i).get(j)+f(i+1,j,triangle,n,dp);
        int dia=triangle.get(i).get(j)+f(i+1,j+1,triangle,n,dp);

        return dp[i][j]=Math.min(d,dia);
    }
    public int minimumTotal(List<List<Integer>> triangle) {

        int n=triangle.size();
        int[][] dp= new int[n][n];
        for(int i=0;i<n;i++)
        Arrays.fill(dp[i],-1);
        return f(0,0,triangle,n,dp);
        
    }
}