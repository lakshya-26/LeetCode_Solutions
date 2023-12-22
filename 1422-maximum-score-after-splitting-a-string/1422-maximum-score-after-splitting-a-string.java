class Solution {
    public int maxScore(String s) {
        int zeroes=0,ones=0,max=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                zeroes++;
            }
            else{
                ones++;
            }
            if(i!=s.length()-1){
                max=Math.max(zeroes-ones,max);
            }
        }
        return max+ones;
        
    }
}