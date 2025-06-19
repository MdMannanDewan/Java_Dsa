import java.util.*;

public class TrappingRainWater {
    public static int getTrappedRainWater(int[] height) {
        int totalHeight = height.length;
        int left[] = new int[totalHeight], right[] = new int[totalHeight], totalWater = 0;
        // Calculate left max boundary
        left[0] = height[0];
        for (int i = 1; i < totalHeight; i++) {
            left[i] = Math.max(left[i - 1], height[i]);
        }
        // Calculate Right max boundary
        right[totalHeight - 1] = height[totalHeight - 1];
        for (int i = totalHeight - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], height[i]);
        }
        // Calculate total trapped water
        for (int i = 0; i < height.length; i++) {
            int waterLevel = Math.min(left[i], right[i]);
            totalWater += (waterLevel - height[i]);
        }
        return totalWater;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 0, 2 };
        int totalTrappedWater = getTrappedRainWater(arr);
        System.out.println(totalTrappedWater);
    }
}
