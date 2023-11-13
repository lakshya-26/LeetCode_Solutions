class Solution {
    public String sortVowels(String s) {
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('A');
        vowels.add('e');
        vowels.add('E');
        vowels.add('i');
        vowels.add('I');
        vowels.add('o');
        vowels.add('O');
        vowels.add('u');
        vowels.add('U');
        List<Character> vowelChars = new ArrayList<>();
        List<Integer> consonantIndices = new ArrayList<>();
        List<Character> consonantChars = new ArrayList<>();
        char[] array = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (vowels.contains(c)) {
                vowelChars.add(c);
            } else {
                consonantIndices.add(i);
                consonantChars.add(c);
            }
        }
        for (int i = 0; i < consonantIndices.size(); i++) {
            int index = consonantIndices.get(i);
            char c = consonantChars.get(i);
            array[index] = c;
        }
        Collections.sort(vowelChars);
        int vowelIndex = 0;
        for (int i = 0; i < array.length; i++) {
            char c = array[i];
            if (c == '\0' && vowelIndex < vowelChars.size()) {
                array[i] = vowelChars.get(vowelIndex);
                vowelIndex++;
            }
        }
        return new String(array);
    }
}