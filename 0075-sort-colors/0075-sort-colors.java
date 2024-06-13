class Solution {
    public void sortColors(int[] arr) {
        int count[]=new int[3],j=0;
        int res[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        count[arr[i]]++;
        for(int i=1;i<3;i++)
        count[i]+=count[i-1];

        for(int i=arr.length-1;i>=0;i--)
        {
            res[count[arr[i]]-1]=arr[i];
            count[arr[i]]--;
        }
        for(int i=0;i<arr.length;i++)
        arr[i]=res[i];


        
        
    }
}