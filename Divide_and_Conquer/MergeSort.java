import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] arr, int sIdx, int eIdx) {
        // base case
        if (sIdx >= eIdx)
            return;
        // main logic
        int mid = sIdx + (eIdx - sIdx) / 2;
        mergeSort(arr, sIdx, mid); // left Part
        mergeSort(arr, mid + 1, eIdx); // right part
        merge(arr, sIdx, mid, eIdx); // merge left and right
    }

    public static void mergeSort2(int[] arr, int sIdx, int eIdx) {
        // base case
        if (sIdx >= eIdx)
            return;
        // main logic
        int mid = sIdx + (eIdx - sIdx) / 2;
        // sort left side
        mergeSort2(arr, sIdx, mid);
        // sort right side
        mergeSort2(arr, mid + 1, eIdx);
        // merge left and right side
        merge2(arr, sIdx, mid, eIdx);
    }

    public static void merge2(int arr[], int sIdx, int mid, int eIdx) {
        // create temporary array to store sorted array
        int temp[] = new int[eIdx - sIdx + 1];
        // put the value in sorted manner
        int i = sIdx;// iterator for left side
        int j = mid + 1;// iterator for right side
        int k = 0; // iterator for temp array
        while (i <= mid && j <= eIdx) {
            if (arr[i] < arr[j])
                temp[k++] = arr[i++];
            else
                temp[k++] = arr[j++];
        }
        // for left side
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        // for right side
        while (j <= eIdx) {
            temp[k++] = arr[j++];
        }
        // copy the value of temp array in the original array
        for (k = 0, i = sIdx; k < temp.length;) {
            arr[i++] = temp[k++];
        }
    }

    public static void merge(int[] arr, int sIdx, int mid, int eIdx) {
        int temp[] = new int[eIdx - sIdx + 1];
        int i = sIdx;// iterator for left part
        int j = mid + 1; // iterator for right part
        int k = 0; // iterator for temp array
        while (i <= mid && j <= eIdx) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
                k++;
            } else {
                temp[k] = arr[j];
                j++;
                k++;
            }
        }

        // for left part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        // for right part
        while (j <= eIdx) {
            temp[k++] = arr[j++];
        }

        // copy temp arr to original array
        for (k = 0, i = sIdx; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8, -2 };
        mergeSort2(arr, 0, (arr.length - 1));
        System.out.println(Arrays.toString(arr));
    }
}
