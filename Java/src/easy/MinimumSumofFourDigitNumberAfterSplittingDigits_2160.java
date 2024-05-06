package easy;

/**
 * Created by: IntelliJ IDEA
 * User      : boyng
 * Date      : 29/02/2024
 * Time      : 3:41 CH
 * Filename  : MinimumSumofFourDigitNumberAfterSplittingDigits_2160
 */
public class MinimumSumofFourDigitNumberAfterSplittingDigits_2160 {
    public int minimumSum(int num) {
        int n = 4;
        int new1 = 0;
        int new2 = 0;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            int digit = num % 10;
            arr[i] = digit;
            num = num - digit;
            num = num / 10;
        }


//        Bubble sort
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }

        new1 = arr[0] * 10 + arr[2];
        new2 = arr[1] * 10 + arr[3];
        return new1 + new2;
    }

    public void swap(int A[], int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    public static void main(String[] args) {
        MinimumSumofFourDigitNumberAfterSplittingDigits_2160 test = new MinimumSumofFourDigitNumberAfterSplittingDigits_2160();
        System.out.println(test.minimumSum(4009));
    }
}
