class Solution {
    public int numRollsToTarget(int n, int k, int target) {
        int[][] dp = new int[n+1][target+1];
        int mod = (int)1e9+7;
        dp[0][0]=1;
        for(int dice=1;dice<=n;dice++){
            for(int t=0;t<=target;t++){
                for(int f=1;f<=k;f++){
                    if(t>=f){
                    dp[dice][t]=  (dp[dice][t] + dp[dice-1][t - f])%mod;
                    }
                }
            }
        }
        return dp[n][target];
    }
}