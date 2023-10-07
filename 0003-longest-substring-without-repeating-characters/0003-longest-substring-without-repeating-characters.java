class Solution {
    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int max_length = 0;
        int start = 0; 
        HashMap<Character, Integer> charIndex = new HashMap<>();

        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);
            if (charIndex.containsKey(c) && charIndex.get(c) >= start) {
                 start = charIndex.get(c) + 1;
            }
            charIndex.put(c, end);
            max_length = Math.max(max_length, end - start + 1);
        }
        return max_length;
    }
}