import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int arr[], int sIdx, int eIdx) {
        // base case
        if (sIdx >= eIdx)
            return;
        // main logic
        // find pivot
        // partition index
        int pIdx = partition(arr, sIdx, eIdx);
        // quickSort left
        quickSort(arr, sIdx, pIdx - 1);
        // quickSort right
        quickSort(arr, pIdx + 1, eIdx);
    }

    public static int partition(int arr[], int sIdx, int eIdx) {
        int i = sIdx - 1;// iterator for partion
        // find pivot
        int pivot = arr[eIdx];
        for (int j = sIdx; j <= eIdx; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        // swap pivot
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[eIdx] = temp;

        return i;
    }

    public static void quickSort2(int arr[], int sIdx, int eIdx) {
        // base case
        if (sIdx >= eIdx) {
            return;
        }
        // partition index
        int pIdx = partition2(arr, sIdx, eIdx);
        // quicksort left side
        quickSort2(arr, sIdx, pIdx - 1);
        // quicksort right side
        quickSort2(arr, pIdx + 1, eIdx);
    }

    public static int partition2(int arr[], int sIdx, int eIdx) {
        // iterator for partition index
        int i = sIdx - 1;
        // find pivot
        int pivot = arr[eIdx];
        // find partition index and move value
        for (int j = sIdx; j <= eIdx; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        // swap pivot
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[eIdx] = temp;
        return i;
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 9, 8, 2, 5, -2, 10 };
        quickSort2(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
