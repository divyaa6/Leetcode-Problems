class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        int a=target.length,b=arr.length;
        if(a!=b)
        return false;
        int i=0;
        while((i<a)&&(i<b))
        {
            if(target[i]!=arr[i])
            return false;
            i++;
        }
        return true;
        
    }
}