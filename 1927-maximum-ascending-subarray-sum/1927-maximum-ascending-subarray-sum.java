class Solution {
    public int maxAscendingSum(int[] nums) {
        int maxi=0,s=nums[0];

        for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i])
            s+=nums[i];
            else{
                maxi=Math.max(maxi,s);
                s=nums[i];
            }
        }
        return Math.max(maxi,s);
        
    }
}