class Solution {
    public String kthDistinct(String[] arr, int k) {
        int n=arr.length,j=0;
        String val="";
        Map<String,Integer> hm= new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int value=hm.getOrDefault(arr[i],0);
            hm.put(arr[i],value+1);
        }
        System.out.println("Created hashmap is" + hm);
        for(String v:arr)
        {
            if(hm.get(v)==1)
            j++;

            if(j==k)
            return v;
        }
        return "";
        
    }
}