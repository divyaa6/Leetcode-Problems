class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int c=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]<=nums[i-1])
            {
                int d=Math.abs(nums[i]-nums[i-1])+1;
                c+=d;
                nums[i]+=d;
            }
        }
        return c;
        
    }
}