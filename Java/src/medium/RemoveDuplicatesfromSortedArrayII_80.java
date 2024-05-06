package medium;

/**
 * Created by: IntelliJ IDEA
 * User      : boyng
 * Date      : 24/02/2024
 * Time      : 2:48 CH
 * Filename  : RemoveDuplicatesfromSortedArrayII_80
 */
public class RemoveDuplicatesfromSortedArrayII_80 {
    public int removeDuplicates(int[] nums) {
        int i = 1, j;
        int numAppearCurrent = 1;
        int numE = nums.length;
        for (j = 1; j < numE; j++) {
            if (nums[j] == nums[j - 1] && numAppearCurrent == 1) {
                nums[i++] = nums[j];
                numAppearCurrent++;
            }
            if (nums[j] != nums[j - 1]) {
                nums[i++] = nums[j];
                numAppearCurrent = 1;
            }
        }
        return i;
    }

    public int removeDuplicates2(int[] nums) {
        int i = 1, j;
        int numAppearCurrent = 1;
        int numE = nums.length;
        for (j = 1; j < numE; j++) {
            if (nums[j] == nums[j - 1]) {
                numAppearCurrent++;
            } else {
                numAppearCurrent = 1;
            }
            if (numAppearCurrent <= 2) {
                nums[i++]=nums[j];
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1, 1, 1, 2, 2, 3};
        RemoveDuplicatesfromSortedArrayII_80 remove = new RemoveDuplicatesfromSortedArrayII_80();
        System.out.println(remove.removeDuplicates(arr));
    }
}
