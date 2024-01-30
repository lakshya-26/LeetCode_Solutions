class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i = 0;
        int j = 0;
        double sum = 0;
        double max = 0;

        while (j < k) {
            sum += nums[j];
            j++;
        }
        max = sum;

        while (j < nums.length) {
            sum += nums[j] - nums[i];
            if(max<=sum){
                max=sum;
            }
           
            i++;
            j++;
        }

        return max / k;
    }
}