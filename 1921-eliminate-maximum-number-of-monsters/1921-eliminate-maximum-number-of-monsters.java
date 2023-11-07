class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        int len = dist.length;
        for(int i=0;i<len;i++){
            dist[i] = dist[i]/speed[i] + (dist[i]%speed[i]!=0?1:0);
        }
        Arrays.sort(dist);
        int i=0;
        while(i<len){
            if(i>=dist[i]){
                break;
            }
            i++;
        }
        return i;
    }
}