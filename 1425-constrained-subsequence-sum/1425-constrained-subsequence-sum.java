class Solution {
    public int constrainedSubsetSum(int[] nums, int k) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int res = dp[0];
        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 0; i < dp.length; i++) {
            dp[i] = nums[i] + (dq.isEmpty() ? 0 : dp[dq.peek()]);
            res = Math.max(res, dp[i]);
            while (!dq.isEmpty() && dp[i] >= dp[dq.peekLast()]) dq.pollLast();
            if (dp[i] > 0) dq.offer(i);
            while (i >= k && !dq.isEmpty() && dq.peek() <= i - k) dq.poll();
        }
        return res;
    }
}