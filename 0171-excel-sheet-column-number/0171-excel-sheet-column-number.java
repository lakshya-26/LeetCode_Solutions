class Solution {
    public int titleToNumber(String columnTitle) {
        int value=0;
        for(int i=0;i<columnTitle.length();i++){
            value += chartoValue(columnTitle.charAt(i),columnTitle.length()-i);
        }
        return value;
    }
    public int chartoValue(char letter,int place){
        int value=Character.getNumericValue(letter)-9;
        if(place==1) return value;
        value *= Math.pow(26,place-1);
        return value;
    }
}