import java.util.*;

public class BinarySearch {
    public static int getValue(int[] arr, int key) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key)
                return mid;
            else if (arr[mid] > key)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int key) {
        for (int start = 0, end = arr.length - 1; start <= end;) {
            // int mid = (start + end) / 2;
            int mid = start + (end - start) / 2;
            if (arr[mid] == key)
                return mid;
            else if (arr[mid] < key)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int marks[] = { 23, 25, 27, 29, 31, 32, 33, 35 };
        int key = 25;
        int idx = getValue(marks, key);
        int idx2 = binarySearch(marks, key);
        System.out.println(idx2);
    }
}
