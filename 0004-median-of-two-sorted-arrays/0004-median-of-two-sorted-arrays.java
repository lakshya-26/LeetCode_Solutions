class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a=nums1.length;
        int b=nums2.length;
        int i=0,j=0,k=0;
        int[] l = new int[a+b];
        while(i<a && j<b){
            if(nums1[i]< nums2[j]){
                l[k++]=nums1[i++];
            }
            else{
                l[k++]=nums2[j++];
            }
        }
        while(i<a){
            l[k++]=nums1[i++];
        }
        while(j<b){
            l[k++]=nums2[j++];
        }
        return l.length%2 == 1 ? (double)l[(l.length-1)/2] : (double)(l[l.length/2-1] + l[l.length/2])/2;
    }
}