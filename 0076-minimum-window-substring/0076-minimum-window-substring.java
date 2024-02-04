class Solution {
    public String minWindow(String s, String t) {
        if(s.equals(t)){
            return s;
        }  
        String ans = "";
        HashMap<Character, Integer> mapT = new HashMap<>(); //frequecny of t
        for(char ch : t.toCharArray()) {
            mapT.put(ch, mapT.getOrDefault(ch,0)+1);
        }

        int mct = 0; //match count
        int dmct = t.length(); //desired match count
        HashMap<Character, Integer> mapS = new HashMap<>();
        int i = -1;
        int j = -1;

        while(true) {
            boolean flag1 = false;
            boolean flag2 = false;

            //acquire the character
            while(i < s.length()-1 && mct < dmct) {
                i++;
                char ch = s.charAt(i);
                mapS.put(ch, mapS.getOrDefault(ch, 0)+1);

                if(mapS.getOrDefault(ch, 0) <= mapT.getOrDefault(ch,0)){
                    mct++;
                }
                flag1=true;
            }

            // Collect answers and release
            while(j < i && mct == dmct) {
                j++;
                String pans = s.substring(j, i+1); //pans = potential answer
                if(ans.length()==0 || pans.length() < ans.length()) {
                    ans = pans;
                }

                char ch = s.charAt(j);
                if(mapS.get(ch)==1) {
                    mapS.remove(ch);
                }
                else {
                    mapS.put(ch, mapS.get(ch)-1);
                }

                if(mapS.getOrDefault(ch, 0) < mapT.getOrDefault(ch, 0)) {
                    mct--;
                }
                flag2=true;
            }
            if(flag1==false && flag2==false) {
                break;
            } 
        }
        return ans;
    }
}