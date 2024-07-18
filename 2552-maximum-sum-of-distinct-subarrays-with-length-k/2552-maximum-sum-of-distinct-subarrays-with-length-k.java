class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long s=0,maxs=0;
        int i=0,j=0,n=nums.length;

        HashMap<Integer,Integer> hm=new HashMap<>();

        while(j<n){
           
            int num=nums[j];
            s+=num;
            hm.put(num,hm.getOrDefault(num,0)+1);

            if((j-i+1)<k)
            j++;

            else
            {
                
                if(hm.size()==k)
                maxs=Math.max(s,maxs);

                s-=nums[i];
                hm.put(nums[i],hm.get(nums[i])-1);
                
                if(hm.get(nums[i])==0)
                hm.remove(nums[i]);

                i++;
                j++;

            }
        }
        return maxs;
        
        
    }
}