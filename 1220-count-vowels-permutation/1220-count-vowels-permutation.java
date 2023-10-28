class Solution {
  public int countVowelPermutation(int n) {
    long a = 1, e = 1, i = 1, o = 1, u = 1, mod = 1000000007;
    
    while(--n != 0){
      long new_a = (e + i + u)%mod;
      long new_e = (a + i)%mod;
      long new_i = (e + o)%mod;
      long new_u = (i + o)%mod;
      a = new_a;
      e = new_e;
      o = i; 
      i = new_i; 
      u = new_u;
    }
    
    return (int)((a + e + i + o + u)%mod);      
  }
}