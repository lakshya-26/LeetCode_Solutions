class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxcandies=0;
        for(int Candy:candies){
            maxcandies=Math.max(Candy,maxcandies);
        }
        List<Boolean> result=new ArrayList<>();
        for(int candy:candies){
            result.add(candy+extraCandies>=maxcandies);
        }
        return result;
    }
}