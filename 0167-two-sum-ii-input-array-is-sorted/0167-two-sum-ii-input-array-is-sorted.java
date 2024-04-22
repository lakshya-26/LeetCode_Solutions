class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int low = 0, high = numbers.length-1;
        while(low<=high){
            int ans = numbers[low]+numbers[high];
            if(ans == target){
                res[0] = low+1;
                res[1] = high+1;
                return res;
            }
            if(ans > target){
                high--;
            }else low++;
        }
        return res;
    }
}