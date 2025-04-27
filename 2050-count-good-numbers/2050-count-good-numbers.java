class Solution {
    private long mod=1_000_000_007;
    public int countGoodNumbers(long n) {

        long even=(n+1)/2;
        long odd=n/2;
        long first=pow(5,even)%mod;
        long second=pow(4,odd)%mod;
        return (int)((first*second)%mod);      
    }
    private long pow(long x, long n) {
    long ans = 1;
    x = x % mod; 

    while (n > 0) {
        if (n % 2 == 1) {
            ans = (ans * x) % mod;
            n = n - 1;
        } else {
            x = (x * x) % mod;
            n = n / 2;
        }
    }
    return ans;
}


}