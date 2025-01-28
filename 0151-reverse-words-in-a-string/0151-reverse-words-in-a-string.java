class Solution {
    public String reverseWords(String s) {
        s=s.strip();
        int l=s.length()-1,r=s.length()-1;
        String res="";
        

        while(l>=0){
            if(s.charAt(l)==' '|| l==0){
                int flag=0;
                for(int i=l;i<=r;i++){
                    if(s.charAt(i)!=' '){
                    res+=s.charAt(i);
                    flag=1;
                    }
                }
                if(l==0)
                break;
                if(flag==1)
                res+=" ";
            
                r=l;
            }
            l--;         
        }
        return res;
    }
}