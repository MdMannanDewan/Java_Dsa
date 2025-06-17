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

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        printSubArrays(arr);
    }
}
