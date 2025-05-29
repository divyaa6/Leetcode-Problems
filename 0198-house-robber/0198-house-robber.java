class Solution {

    public int rob(int ind,int[] nums,int[] dp){
        if (ind>=nums.length)
        return 0;

        if(dp[ind]!=-1)
        return dp[ind];

         int p=nums[ind]+rob(ind+2,nums,dp);
         int np=rob(ind+1,nums,dp);

        return dp[ind]=Math.max(p,np);
    }
    public int rob(int[] nums) {
        int[] dp= new int[nums.length];
        Arrays.fill(dp,-1);
        return rob(0,nums,dp);
        
    }
}