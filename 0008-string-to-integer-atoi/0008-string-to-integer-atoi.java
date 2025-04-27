class Solution {
    public int myAtoi(String s) {
        
        s=s.trim();
        if(s.length()==0)
        return 0;
        int sign=1,i=0;
        long ans=0;

        if(s.charAt(i)=='-'){
            i++;
            sign=-1;
        }
        else if(s.charAt(i)=='+'){
            i++;
        }
        while(i<s.length()){
            char ch=s.charAt(i);
            if(ch<'0' || ch>'9')
            break;
            ans=ans*10+(ch-'0');
            if(ans*sign>Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
            if(ans*sign<Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        
            i++;
        }
        return (int)(ans*sign);      
    }
}