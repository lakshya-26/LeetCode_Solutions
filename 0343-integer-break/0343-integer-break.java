class Solution {
    public int integerBreak(int n) {
        int a = (int)Math.pow(3,n/3);
        int b = (int)Math.pow(3,n/3-1);
        if(n<=5){
            if(n==2) return 1;
            if(n==3) return 2;
            if(n%2==0) return n/2 * n/2;
            else return 6;
        }
        if(n>5){
            if(n%3==0) return a;
            if(n%3==1) return b*4;
            if(n%3==2) return a*2;
        }
        return -1;
    }
}