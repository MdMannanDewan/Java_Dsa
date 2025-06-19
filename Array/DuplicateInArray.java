import java.util.*;

public class DuplicateInArray {
    public static boolean isDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1])
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 12, 4, 2, 53 };
        System.out.println(isDuplicate(arr));
    }
}
