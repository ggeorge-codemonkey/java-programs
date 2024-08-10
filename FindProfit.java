public class FindProfit {
    public static void main(String[] args) {
        //find max profit
       int[] prices = {7,1,5,3,6,4};
     //  int[] prices = {1,2,3,4,5};
     //  int[] prices = {7,1,5,3,6,4};
       int maxProfit = findMaxProfit(prices);
       System.out.println("maxProfit    "+maxProfit);

    }

    public static int findMaxProfit(int[] stocks){
        int profit = 0;
        int buy = stocks[0];
        for(int i=0; i<stocks.length -1; i++){
            if(stocks[i] <buy){
                buy = stocks[i];
            }else if( stocks[i] - buy > profit ){
                profit = stocks[i] - buy;
            }
        }
        return profit;        

    }
}
