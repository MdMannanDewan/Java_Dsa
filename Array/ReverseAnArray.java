import java.util.*;

public class ReverseAnArray {
    public static void getReverse(int[] arr) {
        for (int first = 0, last = arr.length - 1; first < last; first++, last--) {
            // arr[first] += arr[last];
            // arr[last] = arr[first] - arr[last];
            // arr[first] -= arr[last];
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
        }
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5, 6, 35, 8 };
        getReverse(arr1);
        System.out.println(Arrays.toString(arr1));
    }
}
