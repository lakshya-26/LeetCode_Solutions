class Solution {
    public int countHomogenous(String s) {
        int len = s.length();
        char[] sarr = s.toCharArray();
        int i = 0;
        int mod = 1_000_000_007;
        long cnt = 0;
        while(i<len){
            char cur = sarr[i];
            int j=i+1;
            while(j<len && sarr[j]==cur)
                j++;
            cnt = (cnt + (long)(1+j-i)*(j-i)/2)%mod;
            i=j;
        }
        return (int)cnt;
    }
}