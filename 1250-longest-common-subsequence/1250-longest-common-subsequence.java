import java.util.*;
import java.lang.*;
class Solution {
    public int f(int i,int j,String a,String b,int[][] dp){
        if(i<0 || j<0)
        return 0;

        if(dp[i][j]!=-1)
        return dp[i][j];

        if(a.charAt(i)==b.charAt(j))
        return dp[i][j]=1+f(i-1,j-1,a,b,dp);

        return dp[i][j]=Math.max(f(i-1,j,a,b,dp),f(i,j-1,a,b,dp));
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int m=text1.length();
        int n=text2.length();

        int[][] dp=new int[m+1][n+1];

        for(int i=0;i<m;i++)
        Arrays.fill(dp[i],-1);

        return f(m-1,n-1,text1,text2,dp);
        
    }
}