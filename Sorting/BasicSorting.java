import java.util.*;

public class BasicSorting {
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void bubbleSort2(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minpos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minpos] > arr[j])
                    minpos = j;
            }
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

    public static void countingSort(int[] arr) {
        // find range
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(arr[i], min);
            max = Math.max(arr[i], max);
        }
        // int range = max-min+1;
        // make count arr
        int count[] = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        // update the arr
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                for (int j = 0; j < count[i]; j++) {
                    arr[index] = i;
                    index++;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 1, 3, -8, 8, 3, 23, 6, 9 };
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
