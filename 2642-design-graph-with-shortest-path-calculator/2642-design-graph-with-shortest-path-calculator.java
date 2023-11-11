class Graph {
    private int n;
    private Map<Integer, List<int[]>> graph;

    public Graph(int n, int[][] edges) {
        this.n = n;
        this.graph = new HashMap<>();
        for (int[] edge : edges) {
            int from = edge[0];
            int to = edge[1];
            int cost = edge[2];
            graph.computeIfAbsent(from, k -> new ArrayList<>()).add(new int[]{to, cost});
        }
    }

    public void addEdge(int[] edge) {
        int from = edge[0];
        int to = edge[1];
        int cost = edge[2];
        graph.computeIfAbsent(from, k -> new ArrayList<>()).add(new int[]{to, cost});
    }

    public int shortestPath(int node1, int node2) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        Map<Integer, Integer> distances = new HashMap<>();

        pq.offer(new int[]{node1, 0});
        distances.put(node1, 0);

        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int current_node = current[0];
            int current_cost = current[1];

            if (current_node == node2) {
                return current_cost;
            }

            if (graph.containsKey(current_node)) {
                for (int[] neighbor : graph.get(current_node)) {
                    int next_node = neighbor[0];
                    int edge_cost = neighbor[1];
                    int total_cost = current_cost + edge_cost;

                    if (!distances.containsKey(next_node) || total_cost < distances.get(next_node)) {
                        distances.put(next_node, total_cost);
                        pq.offer(new int[]{next_node, total_cost});
                    }
                }
            }
        }

        return -1;
    }
}