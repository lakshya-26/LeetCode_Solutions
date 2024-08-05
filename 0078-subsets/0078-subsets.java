class Solution {
    public List<List<Integer>> subsets(int[] nums) {
         List<List<Integer>> result = new ArrayList<>();
        int subsetCount = 1 << nums.length; 

        for (int i = 0; i < subsetCount; i++) {
            List<Integer> subset = new ArrayList<>();
        
            for (int j = 0; j < nums.length; j++) {
                if ((i & (1 << j)) != 0) {
                    subset.add(nums[j]);
                }
            }
            
            result.add(subset);
        }
        
        return result;
    }
}