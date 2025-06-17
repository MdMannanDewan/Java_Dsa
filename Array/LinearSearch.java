import java.util.*;

public class LinearSearch {
    public static int linearSearch(int arr[], int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int marks[] = { 12, 324, 53, 53, 132, 52, 65, 87, 67, 23 };
        int number = 23;
        int idx = linearSearch(marks, number);
        System.out.println(idx);
    }
}
