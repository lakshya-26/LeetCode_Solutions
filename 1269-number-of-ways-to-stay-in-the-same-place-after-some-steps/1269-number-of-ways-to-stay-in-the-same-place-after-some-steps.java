class Solution {
    final int m=(int)1e9+7;
    public int numWays(int steps, int arrLen) {    
        int dp[][] = new int[steps+1][Math.min(arrLen,steps/2+1)];
        dp[0][0]=1;
        for(int i=1;i<=steps;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=dp[i-1][j];
                if(j>0) dp[i][j]=(dp[i][j]+dp[i-1][j-1])%m;
                if(j<dp[0].length-1) dp[i][j]=(dp[i][j]+dp[i-1][j+1])%m;
            }
        }
        return dp[steps][0];
    }
}