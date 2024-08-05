class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int leftSum=0, rightSum=0;
        int n=cardPoints.length-1,maxSum=0;

        for(int i=0;i<k;i++){
            leftSum+=cardPoints[i];
        }
        maxSum= Math.max(leftSum,maxSum);
        for(int i=k-1;i>=0;i--){

            leftSum-=cardPoints[i];
            rightSum+=cardPoints[n];
            n--;
            maxSum = Math.max(maxSum,leftSum+rightSum);
        }
        return maxSum;
    }
}