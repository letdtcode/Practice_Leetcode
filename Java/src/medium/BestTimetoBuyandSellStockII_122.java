package medium;

/**
 * Created by: IntelliJ IDEA
 * User      : boyng
 * Date      : 26/02/2024
 * Time      : 7:43 CH
 * Filename  : BestTimetoBuyandSellStockII_122
 */
public class BestTimetoBuyandSellStockII_122 {
    public int maxProfit(int[] prices) {
//        int result = 0;
//        int temp;
//        int numE = prices.length;
//        for (int i = 0; i < numE - 1; i++) {
//            temp = 0;
//            for (int j = i + 1; j < numE; j++) {
//                int sub = prices[j] - prices[i];
//                if (sub <= 0 || prices[j] <= prices[j - 1]) {
//                    i = j - 1;
//                    break;
//                }
//                if (j != numE - 1 && prices[j + 1] > prices[j])
//                    continue;
//                temp += sub;
//            }
//            result += temp;
//        }
//        return result;

//        dang solve
        return 0;
    }

    public static void main(String[] args) {
        int prices[] = new int[]{1, 2, 3, 4, 5};
        BestTimetoBuyandSellStockII_122 bestTimetoBuyandSellStockII_122 = new BestTimetoBuyandSellStockII_122();
        System.out.println(bestTimetoBuyandSellStockII_122.maxProfit(prices));
    }
}
