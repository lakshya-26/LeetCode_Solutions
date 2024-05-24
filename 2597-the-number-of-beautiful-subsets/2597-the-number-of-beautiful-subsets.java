class Solution {
    public int beautifulSubsets(int[] nums, int k) {
        return backtrack(nums, k, 0, new ArrayList<>());
    }

    private int backtrack(int[] nums, int k, int index, List<Integer> current) {
        int count = 0;
        for (int i = index; i < nums.length; i++) {
            if (isValid(current, nums[i], k)) {
                current.add(nums[i]);
                count += 1 + backtrack(nums, k, i + 1, current);
                current.remove(current.size() - 1); 
            }
        }
        return count;
    }

    private boolean isValid(List<Integer> current, int num, int k) {
        for (int n : current) {
            if (Math.abs(n - num) == k) {
                return false;
            }
        }
        return true;
    }
}