package easy;

/**
 * Created by: IntelliJ IDEA
 * User      : boyng
 * Date      : 24/02/2024
 * Time      : 2:26 CH
 * Filename  : easy.RemoveDuplicatesfromSortedArray_26
 */
public class RemoveDuplicatesfromSortedArray_26 {
    public int removeDuplicates(int[] nums) {
        int numE = nums.length;
        int newArr[] = new int[numE];
        newArr[0] = nums[0];
        int k = 1;
        for (int i = 1; i < numE; i++) {
            if (nums[i] != nums[i - 1]) {
                newArr[k++] = nums[i];
            }
        }
        for (int i = 0; i < k; i++) {
            nums[i] = newArr[i];
        }
        return k;
    }

    public int removeDuplicates2(int[] nums) {
        int i = 1, j;
        int numE = nums.length;
        for (j = 1; j < numE; j++) {
            if (nums[j] != nums[j - 1]) {
                nums[i++] = nums[j];
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1, 1, 2};
        RemoveDuplicatesfromSortedArray_26 remove = new RemoveDuplicatesfromSortedArray_26();
        System.out.println(remove.removeDuplicates2(arr));
    }
}
