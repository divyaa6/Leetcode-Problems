class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
        return 0;
        
        int l=1;
        Set<Integer> st=new HashSet<>();

        for(int i=0;i<nums.length;i++)
        st.add(nums[i]);

        for(Integer it:st){
            if(!st.contains(it-1)){
                int c=1;
                int x=it;
                while(st.contains(x+1)){
                    x++;
                    c++;
                }
                l=Math.max(l,c);
            }
        }
     return l;   
    }
}