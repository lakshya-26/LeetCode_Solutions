class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
       List<List<Integer>> result = new ArrayList<>();
        for(int num:nums){
            boolean place = false;
            
            for(int i=0;i<result.size();i++){
                if(!result.get(i).contains(num)){
                    result.get(i).add(num);
                        place = true;
                    break;
                }
            }
            if(!place){
                List<Integer> newRes = new ArrayList<>();
                newRes.add(num);
                result.add(newRes);
                
            }
        }
        return result;
    }
}