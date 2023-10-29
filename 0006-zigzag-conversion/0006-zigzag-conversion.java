class Solution {
    public String convert(String s, int numRows) {
        if(numRows<=1){
            return s;
        }
        ArrayList<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<numRows;i++)
            res.add("");
          int r=0,st=1;
            for(char C:s.toCharArray()){
                res.set(r,res.get(r)+C);
                
                if(r==0){
                    st=1;
                }
                else if(r==numRows-1){
                    st=-1;
                }
                r += st;
            }
               
            for(String str : res)
            sb.append(str);
        return sb.toString();

}
}