class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> a = new HashSet<>();
        for(int i:nums1){
            a.add(i);
        }
        Set<Integer> b = new HashSet<>();
        for(int i:nums2){
            b.add(i);
        }
        Set<Integer> common = new HashSet<>();
        for(int i:a){
            if(b.contains(i)){
                common.add(i);
            }
        }
        a.removeAll(common);
        b.removeAll(common);
        return Arrays.asList(new ArrayList<>(a),new ArrayList<>(b));
    }
}