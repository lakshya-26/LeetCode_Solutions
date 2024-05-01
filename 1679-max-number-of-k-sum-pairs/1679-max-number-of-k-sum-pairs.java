class Solution {
public int maxOperations(int[] nums, int k) {
    int res = 0;
    Arrays.sort(nums);
    int left = 0, right = nums.length-1;
    while(left<right){
        if(nums[left]+nums[right] == k){
            res++;
            left++;
            right--;
        }else if(nums[left]+nums[right] < k){
            left++;
        }else{
            right--;
        }
    }
    return res;
}
}