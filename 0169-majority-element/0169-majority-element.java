class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length,maxi=0,k=0;

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i]))
            map.put(nums[i],map.get(nums[i])+1);
            else
            map.put(nums[i],1);
        }

        for(Integer key:map.keySet()){
            if(map.get(key)>maxi){
                maxi=map.get(key);
                k=key;
            }
        }
        return k;

    }
}