import java.util.Arrays;

class Solution {
    public int solve(int ind, int[] a, int[] dp) {
        if (ind == 0)
            return a[0];

        if (ind < 0)
            return 0;

        if (dp[ind] != -1)
            return dp[ind];

        int p = a[ind] + solve(ind - 2, a, dp);
        int np = solve(ind - 1, a, dp);

        dp[ind] = Math.max(p, np);
        return dp[ind];
    }

    public int rob(int[] nums) {
        int n = nums.length;

        if (n == 1)
            return nums[0];

        int[] arr1 = new int[n - 1];
        int[] arr2 = new int[n - 1];

        // Fill arr1 with elements from nums[1] to nums[n-1] (excluding first element)
        for (int i = 1; i < n; i++) {
            arr1[i - 1] = nums[i];
        }

        // Fill arr2 with elements from nums[0] to nums[n-2] (excluding last element)
        for (int i = 0; i < n - 1; i++) {
            arr2[i] = nums[i];
        }

        // Separate dp arrays for each call
        int[] dp1 = new int[n - 1];
        int[] dp2 = new int[n - 1];
        Arrays.fill(dp1, -1);
        Arrays.fill(dp2, -1);

        // Compute the two possible cases
        int first = solve(n - 2, arr2, dp1);
        int second = solve(n - 2, arr1, dp2);

        return Math.max(first, second);
    }
}
