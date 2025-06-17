import java.util.*;

public class SubArrays {
    public static void printSubArrays(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                System.out.print("{");
                for (int k = i; k <= j; k++) {
                    if (k == j) {
                        System.out.print(arr[k]);
                    } else
                        System.out.print(arr[k] + ",");
                }
                System.out.print("},");
            }
            System.out.println();
        }
    }

    public static int maxSubarraySum(int[] arr) {
        int max = Integer.MIN_VALUE, prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        for (int start = 0; start < arr.length; start++) {
            for (int end = start; end < arr.length; end++) {
                int currentSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if (currentSum > max) {
                    max = currentSum;
                }
            }
        }
        return max;
    }

    public static int minSubarraySum(int[] arr) {
        int min = Integer.MAX_VALUE, prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        // Generate Prefix Array
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        // get minimum subarray sum
        for (int start = 0; start < arr.length; start++) {
            for (int end = start; end < arr.length; end++) {
                int subArraySum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                min = min > subArraySum ? subArraySum : min;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        int arr1[] = { 1, 2, -6, 1, -3 };
        // printSubArrays(arr);
        int min = minSubarraySum(arr1);
        System.out.println(min);
    }
}
