class Solution {
    public boolean isArraySpecial(int[] nums) {
        if(nums.length==1)
        return true;

        int i=1;
        while(i<nums.length){
            if((nums[i]%2)==(nums[i-1]%2))
            return false;
            i++;
        }
        return true;

        
    }
}