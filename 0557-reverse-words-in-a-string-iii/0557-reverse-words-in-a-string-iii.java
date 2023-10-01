class Solution {
    public String reverseWords(String s) {
        String[] w=s.split(" ");
        StringBuilder a=new StringBuilder();
        for(String i:w){
            a.append(new StringBuilder(i).reverse()).append(" ");
        }
        return a.toString().trim();
    }
}