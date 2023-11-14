class Solution {
    public int countPalindromicSubsequence(String s) {
        Set<Character> set = new HashSet();
        int len = s.length();
        char[] sarr = s.toCharArray();
        int res = 0;
        for(int i=0; i<len-2&&set.size()<26; i++){
            char c = sarr[i];
            if(set.contains(c)) continue;
            int j=len-1;
            for(; j>i+1; j--)
                if(sarr[j]==c)
                    break;
            if(j>i+1){
                int[] dict = new int[26];
                for(int m=i+1; m<j; m++){
                    if(dict[sarr[m]-'a']==0){
                        res++;
                        dict[sarr[m]-'a']=1;
                    }
                }
            }
            set.add(c);
        }
        return res;
    }
}