class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int res[]=new int[2];

        for(int i=0;i<nums.length;i++){
            int rem=target-nums[i];
 
            if(mp.containsKey(rem)){
                System.out.println(mp.get(rem));
                res[0]=mp.get(rem);
                res[1]=i;
                break;
            }
            else{
                mp.put(nums[i],i);
            }
        }
        return res;
    }
}