package easy;

/**
 * Created by: IntelliJ IDEA
 * User      : boyng
 * Date      : 23/02/2024
 * Time      : 6:16 CH
 * Filename  : easy.RemoveElement_27
 */
public class RemoveElement_27 {
    public int removeElement(int[] nums, int val) {
        int numE = nums.length;
        int newArr[] = new int[numE];
        int i, j, k = 0;
        for (i = 0, j = 0; i < numE; i++) {
            if (nums[i] != val) {
                newArr[j++] = nums[i];
                k++;
            }
        }
        for (int l = 0; l < k; l++) {
            nums[l] = newArr[l];
        }
        return k;
    }

    public static void main(String[] args) {
        RemoveElement_27 removeElement_27 = new RemoveElement_27();
        int[] nums = new int[]{0,1,2,2,3,0,4,2};
        System.out.println(removeElement_27.removeElement(nums, 2));
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
    }
}
