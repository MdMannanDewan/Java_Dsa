public class RotatedSortedArray {
    public static int getTarget(int[] nums, int target) {
        int high = nums.length - 1, mid = 0;
        for (int low = 0; low <= high;) {
            mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[low] <= nums[mid]) {// first half is sorted
                if (nums[low] <= target && nums[mid] > target) { // target lies in first half
                    high = mid - 1;
                } else
                    low = mid + 1;// target lies in second half
            } else {// second half is sorted
                if (nums[mid] < target && nums[high] >= target) {// target lies in second half
                    low = mid + 1;
                } else
                    high = mid - 1;// target is in first half
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        System.out.println(getTarget(arr, target));
    }
}
