class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int left[]=new int[n];
        int res[]=new int[n];
        left[0]=nums[0];

        for(int i=1;i<n;i++){
            left[i]=left[i-1]*nums[i];
        }
        int right=1;
        for(int i=n-1;i>0;i--){
            res[i]=left[i-1]*right;
            right*=nums[i];
        }
        res[0]=right;
        return res;

        
    }
}