class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        int lastantfall=0;
        for(int i:left){
            lastantfall=Math.max(i,lastantfall);
        }
        for(int i:right){
            lastantfall=Math.max(lastantfall,n-i);
        }
        return lastantfall;
    }
}