//best time to buy and sell stocks, so that we have maximum profit.
// Buy and sell can only be done once. 1st we need to buy inorder to sell 
// DP on stocks
public class BuyAndSellStocks {

    public static int maxProfit(int arr[]) {
        int profit = 0;
        int mini = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int cost = arr[i] - mini;
            profit = Math.max(profit, cost);
            mini = Math.min(arr[i], mini);
        }
        return profit;
    } 
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
}
