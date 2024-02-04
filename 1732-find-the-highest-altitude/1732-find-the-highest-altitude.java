class Solution {
    public int largestAltitude(int[] gain) {
        int sum=0;
        int max=0;
        for(int i:gain){
            sum +=i;
            max=Math.max(sum,max);
        }
        return max;
    }
}