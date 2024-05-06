package easy;

/**
 * Created by: IntelliJ IDEA
 * User      : boyng
 * Date      : 27/02/2024
 * Time      : 4:37 CH
 * Filename  : WidestVerticalAreaBetweenTwoPointsContainingNoPoints_1637
 */
public class WidestVerticalAreaBetweenTwoPointsContainingNoPoints_1637 {

    public int maxWidthOfVerticalArea(int[][] points) {
        int numE = points.length;
        int arrX[] = new int[numE + 1];
        for (int j = 0; j < numE; j++) {
            arrX[j] = points[j][0];
        }
        arrX[numE] = 999999999;
        quickSort(arrX, 0, numE);

        int result = 0;
        int temp;
        for (int i = 0; i < numE - 1; i++) {
            temp = arrX[i + 1] - arrX[i];
            if (temp > result)
                result = temp;
        }
        return result;
    }

//    void bubbleSort(int A[], int n) {
//        int i, j, flag;
//        for (i = 0; i < n - 1; i++) {
//            flag = 0;
//            for (j = 0; j < n - 1 - i; j++) {
//                if (A[j] > A[j + 1]) {
//                    flag = 1;
//                    swap(A, j, j + 1);
//                }
//            }
//            if (flag == 0)
//                break;
//        }
//    }
//
//    void selectionSort(int A[], int n) {
//        int j, k, i;
//        for (i = 0; i < n - 1; i++) {
//            for (j = k = i; j < n; j++) {
//                if (A[j] < A[k])
//                    k = j;
//            }
//            swap(A, i, k);
//        }
//    }

    int partition(int A[], int l, int h) {
        int pivot = A[l];
        int i = l, j = h;
        do {
            do {
                i++;
            } while (A[i] <= pivot);
            do {
                j--;
            } while (A[j] > pivot);
            if (i < j)
                swap(A, i, j);
        } while (i < j);
        swap(A, l, j);
        return j;
    }

    void quickSort(int A[], int l, int h) {
        int j;
        if (l < h) {
            j = partition(A, l, h);
            quickSort(A, l, j);
            quickSort(A, j + 1, h);
        }
    }

    void swap(int A[], int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }


    public static void main(String[] args) {
        int A[][] = new int[][]{{3, 1}, {9, 0}, {1, 0}, {1, 4}, {5, 3}, {8, 8}};
        WidestVerticalAreaBetweenTwoPointsContainingNoPoints_1637 result = new WidestVerticalAreaBetweenTwoPointsContainingNoPoints_1637();
        System.out.println(result.maxWidthOfVerticalArea(A));
    }
}
