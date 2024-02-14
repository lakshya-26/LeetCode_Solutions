class Solution {
    public int[] rearrangeArray(int[] nums) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        
        for(int i=0;i<nums.length;i++){
            if(nums[i] >= 0){
                s1.push(nums[i]);
            }else{
                s2.push(nums[i]);
            }
        }
        
        for(int i=nums.length-1;i>=0;i--){
            if(!s1.empty() && i%2==0){
                nums[i] = s1.pop();
            }
            else if(!s2.empty() && i%2!=0){
                nums[i] = s2.pop();
            }
        }
        return nums;
    }
}