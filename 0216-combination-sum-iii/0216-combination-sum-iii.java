class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        int nums[] = {1,2,3,4,5,6,7,8,9};
        List<List<Integer>> answer = new ArrayList<>();
        
        ArrayList<Integer> temp = new ArrayList<>();
        recursion(nums,k,n,0,temp, answer);
        return answer;
    }
    public static void recursion(int[] nums,int k,int target,int curr,ArrayList<Integer> temp, List<List<Integer>> answer)
    {
        if(k == 0)
        {
            if(target == 0)
                answer.add(new ArrayList<>(temp));
            return;
        }
        for(int i=curr;i<nums.length;i++)
        {
            if(target - nums[i] <0)
                break;
            temp.add(nums[i]);
            recursion(nums,k-1,target-nums[i],i+1,temp, answer);
            temp.remove(temp.size()-1);
        }
}
}