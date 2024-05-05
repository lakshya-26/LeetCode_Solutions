class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder res = new StringBuilder();
        int paran = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                paran++;
            }
            if(paran > 1 && s.charAt(i) == '('){
                res.append(s.charAt(i));
            }
            
            if(paran > 1 && s.charAt(i) == ')'){
                res.append(s.charAt(i));
                paran--;
            }else if(s.charAt(i) == ')'){
                paran--;
            }
        }
        return res.toString();
    }
}