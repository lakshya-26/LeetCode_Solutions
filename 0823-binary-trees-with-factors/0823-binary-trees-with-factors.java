class Solution {
    public int numFactoredBinaryTrees(int[] A) {
        int mode=1000000007;
        long ret=0;
        HashMap<Integer,Long> map=new HashMap<>();
        Arrays.sort(A);
        for(int i=0;i<A.length;i++){
            ret++;
            map.put(A[i],1L);
            for(int j=0;j<i;j++){
                if(A[i]%A[j]!=0){continue;}
                int tmp=A[i]/A[j];
                if(tmp<A[0]){break;}
                if(map.containsKey(tmp)){
                    long product=map.get(A[j])*map.get(tmp);
                    ret=(ret+product);
                    map.put(A[i],map.get(A[i])+product);
                }
            }
        }
        return (int)(ret%mode);
    }
}