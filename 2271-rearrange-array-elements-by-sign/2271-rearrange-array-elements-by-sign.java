class Solution {
    public int[] rearrangeArray(int[] nums) {
        int ans[] = new int[nums.length];
        int i=0,pos=0,neg=1;
        while(i<nums.length)
        {
            if(nums[i]>0)
            {
                ans[pos]=nums[i];
                pos=pos+2;
            }
            else
            {
                ans[neg]=nums[i];
                neg=neg+2;
            }
            i++;
        }
        return ans;
        
    }
}