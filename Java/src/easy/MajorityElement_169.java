package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by: IntelliJ IDEA
 * User      : boyng
 * Date      : 24/02/2024
 * Time      : 3:29 CH
 * Filename  : MajorityElement_169
 */
public class MajorityElement_169 {
    public int majorityElement(int[] nums) {
        int numE = nums.length;
        int temp, flag;
//        sorting array (Bubble sort)
        for (int i = 0; i < numE - 1; i++) {
            flag = 0;
            for (int j = 0; j < numE - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    flag = 1;
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
            if (flag == 0)
                break;
        }
        int middle = numE / 2;
        return nums[middle];
    }

    public int majorityElement2(int[] nums) {
        int numE = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numE; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                int valueCurr = map.get(nums[i]);
                map.put(nums[i], valueCurr + 1);
            }
        }

        int max = (int) map.keySet().toArray()[0];
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int numCurr = entry.getKey();
            if (entry.getValue() > map.get(max)) {
                max = numCurr;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int A[] = new int[]{2, 2, 1, 1, 1, 2, 2};

        MajorityElement_169 majorityElement_169 = new MajorityElement_169();
        int result = majorityElement_169.majorityElement(A);
        System.out.println(result);
    }
}
