
public class NthFibonacci {
    public static int getNthFibo(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return getNthFibo(n - 1) + getNthFibo(n - 2);
    }

    public static boolean isSorted(int[] arr, int n) {
        if (n == arr.length - 1)
            return true;
        if (arr[n] > arr[n + 1])
            return false;
        n++;
        return isSorted(arr, n);
    }

    public static int firstOccurance(int[] arr, int key, int idx) {
        if (arr[idx] == key)
            return idx;
        else if (idx == arr.length)
            return -1;
        return firstOccurance(arr, key, idx + 1);
    }

    public static int lastOccurance(int arr[], int key, int idx) {
        if (arr[arr.length - 1 - idx] == key)
            return arr.length - 1 - idx;
        else if (idx == arr.length)
            return -1;
        return lastOccurance(arr, key, idx + 1);
    }

    public static int lastOccurance2(int arr[], int key, int idx) {
        if (idx == arr.length)
            return -1;
        int isFound = lastOccurance2(arr, key, idx + 1);
        if (isFound == -1 && arr[idx] == key)
            return idx;
        return isFound;
    }

    public static int optimizedPower(int base, int pow) {
        if (pow == 1)
            return base;
        int half = optimizedPower(base, pow / 2);
        int halfPow = half * half;
        if (pow % 2 == 1)
            return halfPow *= base;
        return halfPow;
    }

    public static void main(String[] args) {
        // System.out.println(getNthFibo(9));
        // int arr[] = { 1, 2, 3, 4, 5, 8, 3, 7 };
        // System.out.println(isSorted(arr, 0));
        // System.out.println(firstOccurance(arr, 3, 0));
        // System.out.println(lastOccurance(arr, 3, 0));
        System.out.println(optimizedPower(2, 5));
    }
}
