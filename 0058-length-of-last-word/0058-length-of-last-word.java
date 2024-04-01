class Solution {
    public int lengthOfLastWord(String s) {
        String a = s.trim();
        int count = 0;
        for(int i=a.length()-1;i>=0;i--){
            if(a.charAt(i) == ' '){
                break;
            }
            count++;
        }
        return count;
    }
}