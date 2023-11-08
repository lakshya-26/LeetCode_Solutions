class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        if(sx==fx && sy==fy){
            if(t==0 || t>=2) return true;
            else
                return false;
        }
        int diff1=Math.abs(sx-fx);
        int diff2=Math.abs(sy-fy);
        if(diff1>t || diff2>t) return false;
        return true;
    }
}