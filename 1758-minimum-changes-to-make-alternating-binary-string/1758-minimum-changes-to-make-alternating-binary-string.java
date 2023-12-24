class Solution {
    public int minOperations(String s) {
       char a[] = s.toCharArray();
        for(int i=0;i<a.length;i+=2){
            if(a[i]=='1')
                a[i]='0';
            else a[i]='1';
        }
        int zeroes=0,ones=0;
        for(int c:a){
            if(c=='1'){
                ones++;
            }
            else
                zeroes++;
        }
        return Math.min(zeroes,ones);
    }
}