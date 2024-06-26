class Solution {
    public boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }

        // Case :Empty String is a valid palindrome
        if (s.length() == 0 || s.length() == 1) {
            return true;
        }

        int left = 0, right = s.length() - 1;
        while(left <= right) {
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            } else if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            } else {
                if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                    return false;
                } else {
                    left++;
                    right--;
                }
            }
        }
        return true;
    }
}