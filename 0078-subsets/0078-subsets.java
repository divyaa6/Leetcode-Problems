class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        res.add(new ArrayList<>());
        int n=nums.length;

        for(int num=0;num<(1<<n);num++){
            List<Integer> sub=new ArrayList<>();

            for(int i=0;i<n;i++){
                if((num & (1<<i))!=0){
                    sub.add(nums[i]);
                }
            }
            if(sub.size()>0){
                res.add(sub);
            }
        }
        return res;
        
    }
}