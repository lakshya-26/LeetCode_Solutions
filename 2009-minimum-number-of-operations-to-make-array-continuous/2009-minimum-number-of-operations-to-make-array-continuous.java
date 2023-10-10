class Solution {
    public int minOperations(int[] nums) {
        Arrays.sort(nums);
        int min=nums.length-1;
        int i=0;
        int j=1;
        int d=0;
        while(i<nums.length){
            while(j<nums.length && nums[j]-nums[i]<=nums.length-1){
                if(nums[j]==nums[j-1]){
                    d++;
                }
                j++;
            }
            min=Math.min(min,nums.length-(j-i)+d);
            i++;
            while(i<nums.length && nums[i]==nums[i-1]){
                i++;
                d--;
            }
        }
        return min;
    }
}