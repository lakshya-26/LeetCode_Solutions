class Solution {
    public boolean increasingTriplet(int[] nums) {
        int s = Integer.MAX_VALUE;
        int e = Integer.MAX_VALUE;
        for(int i : nums){
            if(s >= i)   s = i;
            else if(e >= i)    e = i;   
            else return true; 
        }
        return false;
    }
}