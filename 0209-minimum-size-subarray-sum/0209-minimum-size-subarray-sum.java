class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0, j=0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;
        while(j<nums.length){
            sum += nums[j];
            while(sum>=target){
                sum -= nums[i];
                minLength = Math.min(j-i+1,minLength);
                i++;
            }
            j++;
        }
        if(minLength == Integer.MAX_VALUE){
            return 0;
        }
        return minLength;
    }
}