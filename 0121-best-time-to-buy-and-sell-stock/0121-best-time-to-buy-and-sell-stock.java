class Solution {
    public int maxProfit(int[] arr) {
        int maxi=0,mini=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            mini=Math.min(mini,arr[i]);
            maxi=Math.max(maxi,arr[i]-mini);
        }
        return maxi;
        
    }
}