class RecentCounter {
    Deque<Integer> dr;
    public RecentCounter() {
        dr = new LinkedList<>();
    }
    
    public int ping(int t) {
        dr.addLast(t);
        while(dr.peekFirst()< t-3000){
            dr.poll();
        }
        return dr.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */