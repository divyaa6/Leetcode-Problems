class Solution {
    public String clearDigits(String s) {
        String res="";

        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))){
                res=res+s.charAt(i);
            }
            else{
                if(res!=null && res.length()>0)
                res=res.substring(0,res.length()-1);
            }
        }
        return res;
        
    }
}