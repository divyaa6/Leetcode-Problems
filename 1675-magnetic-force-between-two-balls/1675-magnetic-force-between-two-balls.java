class Solution {
    boolean isPossibleToPlace(int mid,int[] position,int m)
    {
        int prev=position[0];
        int count=1;

        for(int i=1;i<position.length;i++)
        {
            int curr=position[i];
            if((curr-prev)>=mid)
            {
                count++;
                prev=curr;
            }
            if(count==m)
            break;
        }
        return (count==m);
    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
       int minf=1,maxf=position[position.length-1]-position[0];
       int ans=1;
       while(minf<=maxf)
       {
        int midf=minf+(maxf-minf)/2;
        if(isPossibleToPlace(midf,position,m))
        {
            ans=midf;
            minf=midf+1;
        }
        else
        {
            maxf=midf-1;
        }

       }
    return ans;
        
    }
}