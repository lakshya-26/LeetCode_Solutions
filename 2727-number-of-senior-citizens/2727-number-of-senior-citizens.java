class Solution {
    public int countSeniors(String[] details) {
        int cnt = 0;
        for(int i=0;i<details.length;i++){
            String extractedChars = details[i].substring(11, 13);
            int res = Integer.parseInt(extractedChars);
            if(res>60){
                cnt++;
            }
        }
        return cnt;
    }
}