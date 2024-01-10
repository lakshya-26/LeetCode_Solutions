class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int[] newArray = Arrays.copyOf(candies,candies.length);
        Arrays.sort(newArray);
        List<Boolean> result = new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies >= newArray[newArray.length-1]){
                result.add(true);
            }
            else{
                result.add(false);
            }
        }
        return result;
    }
}