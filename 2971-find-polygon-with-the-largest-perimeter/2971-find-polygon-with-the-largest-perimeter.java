class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int s = nums.length-2;
        int e = nums.length-1;
        long sum = 0;
        while(e>=2){
            for(int i=0;i<=s;i++){
            sum += nums[i];
        }
            if(sum>nums[e]){
            return sum+nums[e];
            }else{
                s--;
                e--;
                sum=0;
            }
        }
        return -1;
    }
}