class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        for(int i=0;i<prices.length;i++){
            for(int j=1;j<prices.length;j++){
            if(prices[i]+prices[j]==money){
                return 0;
            }
            else if(prices[i]+prices[j]<money){
                int sum=prices[i]+prices[j];
                return money-sum;
            }
        }
    }
        return money;
    }
}