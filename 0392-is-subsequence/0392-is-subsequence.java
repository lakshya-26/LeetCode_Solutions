class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0) return true;
        if(t.length() == 0) return false;
        int a = 0;
        for(int i=0; i < t.length(); i++){
            if (s.charAt(a) == t.charAt(i)) {
                a++;
                if(a == s.length()){
                    return true;
                }
            }
        }
        return false;
    }
}