class Solution {
    public int largestAltitude(int[] gain) {
        int[] res = new int[gain.length+1];
        res[0] = 0;
        int maxAltitude = res[0];
        for(int i=1;i<gain.length;i++){
            res[i] = res[i-1] + gain[i-1];
            if(res[i]>maxAltitude){
                maxAltitude = res[i];
            }
        }
        res[res.length-1] = res[res.length-2] + gain[gain.length-1];
        if(res[res.length-1] > maxAltitude)
            maxAltitude = res[res.length-1];
        
        return maxAltitude;
    }
}