class Solution {
    public int majorityElement(int[] nums) {
        int c=0,ele=-1,n=nums.length;

        for(int i=0;i<n;i++){
            if(c==0){
                c=1;
                ele=nums[i];
            }

            else if(nums[i]==ele)
            c++;

            else
            c--;
        }

        return ele;

    }
}