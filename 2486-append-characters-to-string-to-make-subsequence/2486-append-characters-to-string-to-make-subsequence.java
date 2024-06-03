class Solution {
    public int appendCharacters(String s, String t) {
        if(s.length() == 0) return t.length();
        int count = 0;
        int j = 0;
        for(int i=0;i<s.length();i++){
            if(j != t.length()){
                if(s.charAt(i) == t.charAt(j)){
                j++;
                }
            }
            
            if(j == t.length()){
                break;
            }
        }
        if(j != t.length()) count = t.length() - j;
        
        return count;
    }
}