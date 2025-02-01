class Solution {
    public int subarraySum(int[] nums, int k) {
        int s=0,c=0;
        Map<Integer,Integer> pre=new HashMap<>();
        pre.put(0,1);

        for(int i=0;i<nums.length;i++){
            s=s+nums[i];
            int rem=s-k;
            c+=pre.getOrDefault(rem,0);
            pre.put(s,pre.getOrDefault(s,0)+1);


        }
        return c;
        
    }
}