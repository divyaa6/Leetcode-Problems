class Solution {
    public long countBadPairs(int[] nums) {
        long c=0,n=nums.length;
        long tp=(n*(n-1))/2;
        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int val=nums[i]-i;
            if(map.containsKey(val)){
                map.put(val,map.get(val)+1);
            }
            else{
                map.put(val,1);
            }
        }
        for(Map.Entry<Integer,Integer> x:map.entrySet()){
            System.out.print(x.getKey());
            System.out.println(x.getValue());
        }
        for(Map.Entry<Integer,Integer> x:map.entrySet()){
            if(x.getValue()>1){
                tp-=((x.getValue()*(x.getValue()-1))/2);
            }
        }
    
     return tp;
    }
}