class Solution {
    public void stacksimulation(LinkedList<Character> stack,String str){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='#'){
                if(stack.size()>0){
                    stack.removeLast();
                }
            }
            else{
                stack.add(str.charAt(i));
            }
        }
    }
    public boolean backspaceCompare(String s, String t) {
        LinkedList<Character> stackA = new LinkedList<>();
        LinkedList<Character> stackB = new LinkedList<>();
        stacksimulation(stackA,s);
        stacksimulation(stackB,t);
        while(stackA.size()>0 && stackB.size()>0){
            if(stackA.getFirst()!=stackB.getFirst()){
                return false;
            }
            stackA.removeFirst();
            stackB.removeFirst();
        }
        if(stackA.size()>0 || stackB.size()>0)
            return false;
        return true;
    }
}