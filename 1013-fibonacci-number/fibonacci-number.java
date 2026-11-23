class Solution {
    public int fib(int n) {

        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        return helper(n, dp);
    }

    int helper(int n, int[] dp) {

        if (n <= 1) {
            return n;
        }

        if (dp[n] != -1) {
            return dp[n];
        }

        int first = helper(n - 1, dp);
        int second = helper(n - 2, dp);

        return dp[n] = first + second;
    }
}