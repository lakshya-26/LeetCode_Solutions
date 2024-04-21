class Solution {
    public boolean isPalindrome(String s) {
        String lowerCase = s.toLowerCase();
        String noSpace = lowerCase.replaceAll("\\b\\s+\\b", "");
        String finalString = noSpace.replaceAll("[^a-zA-Z0-9]", "");
        int len = finalString.length();
        
        int l = 0;
        int h = len-1;
        while(l<=h){
            if(finalString.charAt(l) != finalString.charAt(h)){
                return false;
            }
            l++;
            h--;
        }
        return true;
    }
}