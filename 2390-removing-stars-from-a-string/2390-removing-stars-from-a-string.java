class Solution {
    public String removeStars(String s) {
        Stack<Character> backspace=new Stack<>(); 
        for(char i:s.toCharArray()){
            backspace.add(i);
        }
        StringBuilder res=new StringBuilder();
        int countStar=0;
        while(!backspace.isEmpty()){
            if(backspace.peek()=='*'){
                countStar++;
                backspace.pop();
            }
            else if((countStar!=0)&&(Character.isLetter(backspace.peek()))){
                backspace.pop();
                countStar--;
            }
            else{
                res.append(backspace.peek());
                backspace.pop();
            }
        }
        return res.reverse().toString();

    }
}