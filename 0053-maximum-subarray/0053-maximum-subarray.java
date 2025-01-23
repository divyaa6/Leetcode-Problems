class Solution {
    public int maxSubArray(int[] nums) {
        int maxi=Integer.MIN_VALUE,s=0;

        for(int i=0;i<nums.length;i++){
            s+=nums[i];

            if(s>maxi)
            maxi=s;

            if(s<0)
            s=0;
        }
        return maxi;
        
    }
}