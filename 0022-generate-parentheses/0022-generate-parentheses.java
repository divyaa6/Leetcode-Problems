class Solution {
    public void solve(int n,String curr,int open,int close,List<String> arr){
        if(curr.length()==(n*2)){
            arr.add(curr);
            return;
        }
        if(open<n){
            solve(n,curr+"(",open+1,close,arr);
        }
        if(close<open){
            solve(n,curr+")",open,close+1,arr);
        }
        
    }
    public List<String> generateParenthesis(int n) {
        List<String> arr= new ArrayList<>();
        solve(n,"",0,0,arr);
        return arr;
        
    }
}