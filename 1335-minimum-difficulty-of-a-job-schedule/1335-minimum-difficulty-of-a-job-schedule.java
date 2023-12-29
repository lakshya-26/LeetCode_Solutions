class Solution {
    public int minDifficulty(int[] jobDifficulty, int d) {
        int n=jobDifficulty.length;
        int[][] dp =new int[d+1][n+1];
        
        if(d>n)
            return -1;
        for(int i=1;i<=n;i++)
            dp[1][i]= Math.max( dp[1][i-1], jobDifficulty[i-1]);
        
        for(int i=2;i<=d;i++) {
            for(int j=i;j<=n;j++) {
                
                dp[i][j]=Integer.MAX_VALUE;
                int currmax=0;
                for(int k=j;k>=i;k--) {
                    
                    currmax = Math.max( currmax, jobDifficulty[k-1]);
                    dp[i][j] = Math.min( dp[i][j], dp[i-1][k-1] + currmax);
                }
            }
        }
        return dp[d][n];
    }
}
