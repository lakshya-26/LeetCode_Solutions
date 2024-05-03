class Solution {
    
    public static int maxElement(int [][]matrix, int n, int m, int x){
        int maxValue = -1;
        int index = -1;
        for(int i=0;i<n;i++){
            if(matrix[i][x] > maxValue){
                maxValue = matrix[i][x];
                index = i;
            }
        }
        return index;
    }
    
    public int[] findPeakGrid(int[][] G) {
        int n = G.length;
       int m = G[0].length;
       int low = 0, high = m-1;
       while(low<=high){
           int mid = (low+high) / 2;
           int row = maxElement(G, n, m, mid);
           int left = mid - 1 > 0 ? G[row][mid-1]: -1;
           int right = mid + 1 < m ? G[row][mid+1]: -1;
           if(G[row][mid] > left && G[row][mid]>right){
               return new int[] {row, mid};
           }else if(G[row][mid] < left){
               high = mid -1;
           }else{
               low = mid + 1;
           }
       }
        return new int[] {-1, -1};
    }
}