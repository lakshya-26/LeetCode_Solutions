class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int N = nums1.length;
        int M = nums2.length;
        int i=0;
        int j=0;
        
        Set<Integer> result = new HashSet<>();
        while(i<N && j<M){
            if(nums1[i]==nums2[j]){
                result.add(nums1[i]);
                i++;
                j++;
            } else if(nums1[i]<nums2[j]){
                i++;
            } else{
                j++;
            }
        }
        
        int K = result.size();
        int[] res = new int[K];
        int current = 0;
        for(int x:result){
            res[current++] = x;
        }
        
        return res;
    }
}