class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        ArrayList<Integer> a = new ArrayList<>();
        int c=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                c++;
            }
            else{
                a.add(c);
                c=1;
            }
        }
        a.add(c);
        Collections.sort(a);
        for(int i=1;i<a.size();i++){
            if(a.get(i)==a.get(i-1)){
                return false;
            }
        }
        return true;
    }
}