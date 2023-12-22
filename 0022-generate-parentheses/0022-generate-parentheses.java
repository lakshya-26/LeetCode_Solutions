class Solution {
    public List<String> generateParenthesis(int n) {
        Set<String> res = new HashSet<>();
        for (int i = 0; i < n; i++) {
            Set<String> tmp = new HashSet<>();
            for (String s : res) {
                for (int j = 1; j <= s.length(); j++) {
                    String cand = s.substring(0, j) + "()" + s.substring(j);
                    tmp.add(cand);
                }
                tmp.add(s + "()");
            }
            if (i == 0) tmp.add("()");
            res = tmp;
        }
        return new LinkedList<String>(res);  
    }
}