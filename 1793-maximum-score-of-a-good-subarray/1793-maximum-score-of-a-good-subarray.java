class Solution {
 public int maximumScore(int[] nums, int k) {
        int N = nums.length, res = 0;
        for (int value = nums[k], left = k, right = k; value > 0; value--) {
            while (left > 0 && nums[left - 1] >= value) left--;
            while (right + 1 < N && nums[right + 1] >= value) right++;
            res = Math.max(res, (right - left + 1) * value);
        }
        return res;
    }
}