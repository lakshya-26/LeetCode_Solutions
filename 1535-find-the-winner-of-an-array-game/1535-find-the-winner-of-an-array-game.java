class Solution {
    public int getWinner(int[] arr, int k) {
        if(k==1){
            return Math.max(arr[0],arr[1]);
        }
        int current=arr[0];
        int c=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>current){
                current=arr[i];
                c=1;
            }
            else{
                c++;
            }
               if(c==k){
            return current;
        }
        }
        return current;
    }
}