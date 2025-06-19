public class DuplicateInArray {
    public static boolean isDuplicate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 12, 4, 2, 53 };
        System.out.println(isDuplicate(arr));
    }
}
