class Solution {
    public int[] findErrorNums(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int duplicate = -1;
        int n = nums.length;
        long sum = (n * (n + 1)) / 2; // Sum of first n natural numbers

        for (int num : nums) {
            if (set.contains(num)) {
                duplicate = num;
            } else {
                set.add(num);
                sum -= num; // Subtracting each number from sum
            }
        }

        return new int[]{duplicate, (int) sum};
    }
}