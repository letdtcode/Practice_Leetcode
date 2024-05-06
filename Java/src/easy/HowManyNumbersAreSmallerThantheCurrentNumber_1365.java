package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by: IntelliJ IDEA
 * User      : boyng
 * Date      : 28/02/2024
 * Time      : 9:30 CH
 * Filename  : HowManyNumbersAreSmallerThantheCurrentNumber_1365
 */
public class HowManyNumbersAreSmallerThantheCurrentNumber_1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int numE = nums.length;
        int[] result = new int[numE];

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numE; i++) {
            if (map.containsKey(nums[i])) {
                int newValue = map.get(nums[i]) + 1;
                map.put(nums[i], newValue);
            } else {
                map.put(nums[i], 1);
            }
        }

        Integer[] arrInteger = map.keySet().toArray(new Integer[map.size()]);
        int[] arr = new int[map.size()];
        int index = 0;
        for (Integer item : arrInteger) {
            arr[index++] = item.intValue();
        }
        Arrays.sort(arr);

        Map<Integer, Integer> resultMap = new HashMap<>();
        resultMap.put(arr[0], 0);
        for (int i = 1; i < map.size(); i++) {
            int countE = 0;
            for (int j = 0; j < i; j++) {
                countE += map.get(arr[j]);
            }
            resultMap.put(arr[i], countE);
        }

        for (int i = 0; i < numE; i++) {
            result[i] = resultMap.get(nums[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{8, 1, 2, 2, 3};
        HowManyNumbersAreSmallerThantheCurrentNumber_1365 test = new HowManyNumbersAreSmallerThantheCurrentNumber_1365();
        test.smallerNumbersThanCurrent(arr);
    }
}
