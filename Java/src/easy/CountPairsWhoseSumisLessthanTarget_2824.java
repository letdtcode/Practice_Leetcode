package easy;

import java.util.List;

/**
 * Created by: IntelliJ IDEA
 * User      : boyng
 * Date      : 28/02/2024
 * Time      : 9:19 CH
 * Filename  : CountPairsWhoseSumisLessthanTarget_2824
 */
public class CountPairsWhoseSumisLessthanTarget_2824 {

    public int countPairs(List<Integer> nums, int target) {
        int numE = nums.size();
        int A[] = nums.stream().mapToInt(i -> i).toArray();

        int countPairs = 0;
        for (int i = 0; i < numE; i++) {
            for (int j = i + 1; j < numE; j++) {
                int result = A[i] + A[j];
                if (result < target) {
                    countPairs++;
                }
            }
        }
        return countPairs;
    }

    public static void main(String[] args) {

    }
}
