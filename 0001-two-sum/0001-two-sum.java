class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2];
        ans[0] = ans[1] = -1;
        HashMap<Integer, Integer> mpp = HasMap<>();
        for(int i=0;i<nums.length;i++){
            int a = Math.abs(target-nums[i]);
            if(mpp.containsKey(a)){
                ans[0] = mpp.get(a);
            }
        }
    }
}