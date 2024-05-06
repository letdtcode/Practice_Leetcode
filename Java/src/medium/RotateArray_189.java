package medium;

/**
 * Created by: IntelliJ IDEA
 * User      : boyng
 * Date      : 25/02/2024
 * Time      : 6:02 CH
 * Filename  : RotateArray_189
 */
public class RotateArray_189 {
    public static void reverse(int arr[], int i, int j) {
        int left = i;
        int right = j;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public void rotate(int[] nums, int k) {
        int numE = nums.length;
        k = k % numE;
        if (k < 0)
            k += numE;

        reverse(nums, 0, numE - k - 1);
        reverse(nums, numE - k, numE - 1);
        reverse(nums, 0, numE - 1);
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7};
        int k = 101;
        RotateArray_189 rotateArray_189 = new RotateArray_189();
        rotateArray_189.rotate(arr, k);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
