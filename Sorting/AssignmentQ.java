import java.util.Arrays;

public class AssignmentQ {
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPosition = i;
            for (int j = i + 1; j < arr.length; j++) {
                // minPosition = Math.min(arr[minPosition], arr[j])
                if (arr[minPosition] > arr[j])
                    minPosition = j;
            }
            if (minPosition != i) {
                int temp = arr[minPosition];
                arr[minPosition] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void insertionSort(int[] arr) {
        // insertion with swapping
        // for (int i = 0; i < arr.length - 1; i++) {
        // for (int j = i + 1; j > 0; j--) {
        // if (arr[j] < arr[j - 1]) {
        // int temp = arr[j];
        // arr[j] = arr[j - 1];
        // arr[j - 1] = temp;
        // }
        // }
        // }
        // insertion with shifting
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
    }

    public static void countingSort(int[] arr) {
        // find maximum
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(arr[i], max);
        }
        // create count arr
        int count[] = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        // update arr
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                for (int j = count[i]; j > 0; j--) {
                    arr[index] = i;
                    index++;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        countingSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
