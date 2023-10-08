class Solution {
    public int maxDotProduct(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int[][] a=new int[n+1][m+1];
        for(int []i:a){
            Arrays.fill(i,Integer.MIN_VALUE);
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                a[i][j]=nums1[i-1]*nums2[j-1];
                a[i][j] = (int)Math.max(Math.max(a[i-1][j], a[i][j-1]), Math.max(a[i-1][j-1] + (long)a[i][j], a[i][j]));
            }
        }
        return a[n][m];
    }
}