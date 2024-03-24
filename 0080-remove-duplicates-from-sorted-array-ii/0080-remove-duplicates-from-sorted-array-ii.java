class Solution {
    public int removeDuplicates(int[] nums) {
        int p = 0, c = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[p] == nums[i]) {
                if (c < 2) {
                    c++;
                    nums[++p] = nums[i];
                }
            } else {
                c = 1;
                nums[++p] = nums[i];
            }
        }
        return ++p;
    }
}