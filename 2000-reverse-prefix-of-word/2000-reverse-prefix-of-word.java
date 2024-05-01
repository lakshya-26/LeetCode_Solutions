class Solution {
    public String reversePrefix(String word, char ch) {
        int index = -1;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i) == ch){
                index = i;
                break;
            }
        }
        
        if(index == -1){
            return word;
        }
        
        StringBuilder reversed = new StringBuilder(word.substring(0, index + 1));
        reversed.reverse();
        
        if (index + 1 < word.length()) {
            reversed.append(word.substring(index + 1));
        }
    
        return reversed.toString();
    }
}