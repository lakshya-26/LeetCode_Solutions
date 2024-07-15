class Solution {
    public int maxArea(int[] height) {
        int low = 0;
        int high = height.length-1;
        int maxArea = 0;
        while(low<=high){
            int area = Math.min(height[low], height[high]) * (high-low);
            maxArea = Math.max(maxArea, area);
            if(height[low]<height[high]){
                low++;
            }else{
                high--;
            }
        }
        return maxArea;
    }
}
  