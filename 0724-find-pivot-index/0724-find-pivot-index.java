class Solution {
    public int pivotIndex(int[] nums) {
        int total=0,sum=0;
        for(int i:nums){
            total += i;
        }
        for(int i=0;i<nums.length;i++){
            if(sum*2 == total - nums[i]){
                return i;
            }
            sum += nums[i];
        }
        return -1;
    }
}