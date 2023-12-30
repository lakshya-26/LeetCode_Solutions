class Solution {
    public boolean makeEqual(String[] words) {
        int a[] = new int[26];
        for(int i=0;i<words.length;i++)
        {
            for(int j=0;j<words[i].length();j++)
                a[words[i].charAt(j)-97]++;
        }
        for(int x:a)   
        {
           if(x%words.length!=0)
               return false;
        }
        return true;
    }
}