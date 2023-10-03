class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] hash = new int[101];
        for(int n : nums) hash[n]++;
        int res = 0;
        for(int i = 1; i <= 100; i++) {
            if(hash[i] >= 2) res += hash[i] * (hash[i] - 1) / 2;
        }
        return res;
    }
}