class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int summ[]=new int[((n*(n+1)/2))];
        int k=0;
        for(int j=0;j<n;j++)
        {
            int total=0;
            int i=j;
            while(i<n)
            {
                total=total+nums[i];
                summ[k]=total;
                i++;
                k++;
            }
        }
        Arrays.sort(summ);
        left--;
        right--;
        long res=0;
        int mod=1000000007;
        while(left<=right)
        {
            res=(res+summ[left])%mod;
            left++;
        }
        return (int)res;
        
    }
}