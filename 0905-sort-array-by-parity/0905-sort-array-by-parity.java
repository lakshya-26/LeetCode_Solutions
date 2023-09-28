class Solution {
    public int[] sortArrayByParity(int[] a) {
        int[] arr=new int[a.length];
        int l=0;
        int r=a.length-1;
        for(int i:a){
            if(i%2==0){
                arr[l++]=i;
            }
            else
                arr[r--]=i;
        }
        return arr;
    }
}