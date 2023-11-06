class Solution {
    public String decodeString(String s) {
        int i = s.indexOf(']');
        if (i == -1) return s;
        int j = s.substring(0, i).lastIndexOf('[');
        int t = j;
        while (t > 0 && s.charAt(t - 1) >= '0' && s.charAt(t - 1) <= '9') {
            t--;
        }
        StringBuilder builder = new StringBuilder();
        builder.append(s.substring(0, t));
        if (t != j) {
            int count = Integer.parseInt(s.substring(t, j));
            String mid = s.substring(j + 1, i);
            for (int k = 0; k < count; k++) {
                builder.append(mid);
            }
        }
        builder.append(s.substring(i + 1));
        return decodeString(builder.toString());
    }
}