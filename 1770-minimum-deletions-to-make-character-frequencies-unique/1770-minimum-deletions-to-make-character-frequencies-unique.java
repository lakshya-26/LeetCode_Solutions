class Solution {
    public int minDeletions(String s) {
        HashMap<Character, Integer> mp = new HashMap<>();
        int det = 0;
        HashSet<Integer> mySet = new HashSet<>();

        for(char c: s.toCharArray()){
            mp.put(c, mp.getOrDefault(c, 0) + 1);
        }

        for(int freq: mp.values()){
            while(freq> 0 && mySet.contains(freq)){
                freq--;
                det++;
            }
            mySet.add(freq);
        }

        return det;
    }
}