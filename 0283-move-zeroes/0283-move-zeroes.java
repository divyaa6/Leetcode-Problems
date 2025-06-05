class Solution {
    public void moveZeroes(int[] nums) {
        int left=0,right=1;
        while(right<nums.length){
            if(nums[left]!=0)
            left++;

            if(nums[right]!=0){
                System.out.println(nums[left]+" "+nums[right]);
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                left++;
            }
            right++;
        }
        
    }
}