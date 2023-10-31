class Solution {
    public int[] findArray(int[] pref) {
        int[] a = new int[pref.length];
        int p=0;
        for(int i=0;i<pref.length;i++){
            a[i] = p^pref[i];
            p=pref[i];
        }
        return a;
    }
}