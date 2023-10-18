class Solution {
    public int minimumTime(int n, int[][] dependencies, int[] time) {
        List<Integer>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) graph[i] = new ArrayList<>();
        int[] indegree = new int[n];
        for (int[] dependency : dependencies) {
            graph[dependency[0] - 1].add(dependency[1] - 1);
            indegree[dependency[1] - 1]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) if (indegree[i] == 0) q.add(i);
        int[] dp = new int[n];
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int cur = q.poll();
                dp[cur] += time[cur];
                for (int nei : graph[cur]) {
                    if (--indegree[nei] == 0) q.add(nei);
                    dp[nei] = Math.max(dp[cur], dp[nei]);
                }
            }
        }
        int max = 0;
        for (int d : dp) max = Math.max(max, d);
        return max;
    }
}