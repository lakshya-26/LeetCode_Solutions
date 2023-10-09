class Solution {
    public int[] searchRange(int[] nums, int target) {
        int a=0;
        int b=nums.length-1;
        while(a<=b){
            int m=a+(b-a)/2;
            if(nums[m]==target && nums[a]==nums[b]){
                return new int[]{a,b};
            }
            else if(nums[m]==target && nums[a]<target){
                a++;
            }
            else if(nums[m]==target && nums[b]>target){
                b--;
            }
            else if(nums[m]<target){
                a=m+1;                
            }
            else{
                b=m-1;
            }
        }
        return new int[]{-1,-1};
    }
}