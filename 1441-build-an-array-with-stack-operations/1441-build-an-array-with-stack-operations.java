class Solution {
    public List<String> buildArray(int[] target, int n) {
        LinkedList<String> stack = new LinkedList<>();
        int i=1;
        for(int nums:target){
            while(i<nums && i<n){
                ++i;
                stack.add("Push");
                stack.add("Pop");
            }
            ++i;
            stack.add("Push");
        }
        return stack;
        
    }
}