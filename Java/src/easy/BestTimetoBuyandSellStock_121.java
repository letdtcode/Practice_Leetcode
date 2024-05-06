package easy;

/**
 * Created by: IntelliJ IDEA
 * User      : boyng
 * Date      : 26/02/2024
 * Time      : 7:18 CH
 * Filename  : BestTimetoBuyandSellStock_121
 */
public class BestTimetoBuyandSellStock_121 {

    public int maxProfit(int[] prices) {
        int numE = prices.length;
        int result = 0;
        int small = prices[0];
        int temp;
        for (int i = 1; i < numE; i++) {
            if (prices[i] < small) {
                small = prices[i];
            } else {
                temp = prices[i] - small;
                if (temp > result)
                    result = temp;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int prices[] = new int[]{7, 2, 8, 1, 6, 4};
        BestTimetoBuyandSellStock_121 bestTimetoBuyandSellStock_121 = new BestTimetoBuyandSellStock_121();
        System.out.println(bestTimetoBuyandSellStock_121.maxProfit(prices));
    }
}
