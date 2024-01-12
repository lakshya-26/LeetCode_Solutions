class Solution {
 public String reverseVowels(String s) {
    char[] characters = s.toCharArray();
    String vowels = "aeiouAEIOU";
    int start = 0;
    int end = s.length() - 1;
    while (start < end) {
        while (start < end && !vowels.contains(characters[start] + "")) {
            start++;
        }
        while (start < end && !vowels.contains(characters[end] + "")) {
            end--;
        }
        char temp = characters[start];
        characters[start] = characters[end];
        characters[end] = temp;
        
        start++;
        end--;
    }
    return new String(characters);
}
}