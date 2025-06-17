import java.util.*;

public class FindTheLargestNumber {
    public static int largestNumber(int[] arr) {
        int max = Integer.MIN_VALUE;// negative infinity
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 3, 53, 23, 5656565, 564, 7654, 34335, 342, 75, 234 };
        int largest = largestNumber(numbers);
        System.out.println(largest);
    }
}