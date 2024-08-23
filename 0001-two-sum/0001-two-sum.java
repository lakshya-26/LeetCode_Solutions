class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2];
        ans[0] = ans[1] = -1;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int a = target-nums[i];
            if(mpp.containsKey(a)){
                ans[0] = mpp.get(a);
                ans[1] = i;
                return ans;
            }
            mpp.put(nums[i], i);
        }
        return ans;
    }
}