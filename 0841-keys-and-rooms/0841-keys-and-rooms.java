class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean visited[] = new boolean[rooms.size()];
        dfs(rooms,visited,0);
        for(boolean i:visited){
            if(!i)
                return false;
        }
        return true;
    }
    
    private void dfs(List<List<Integer>> rooms, boolean[] visited, int cur){
        if(visited[cur]) return;
        
        visited[cur] = true;
        
        for(int i:rooms.get(cur)){
            dfs(rooms,visited,i);
        }
    }
}