package easy;

/**
 * Created by: IntelliJ IDEA
 * User      : boyng
 * Date      : 23/02/2024
 * Time      : 3:20 CH
 * Filename  : easy.MergeSortedArray_88
 */
public class MergeSortedArray_88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int totalE = m + n;
        int[] result = new int[totalE];
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j])
                result[k++] = nums1[i++];
            else
                result[k++] = nums2[j++];
        }
        while (i != m) {
            result[k++] = nums1[i++];
        }
        while (j != n) {
            result[k++] = nums2[j++];
        }

        for (int l = 0; l < totalE; l++) {
            nums1[l] = result[l];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        MergeSortedArray_88 mergeSortedArray_88 = new MergeSortedArray_88();
        mergeSortedArray_88.merge(nums1, m, nums2, n);
        for (int i = 0; i < 6; i++) {
            System.out.println(nums1[i]);
        }
    }
}
