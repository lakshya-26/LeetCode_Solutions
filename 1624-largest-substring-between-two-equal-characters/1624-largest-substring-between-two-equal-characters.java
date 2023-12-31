class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
		int max = -1;
		for(char ch : s.toCharArray()){
			max = Math.max(max, s.lastIndexOf(ch) - s.indexOf(ch)-1);
		}
		return max;
	}
}