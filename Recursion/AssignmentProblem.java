public class AssignmentProblem {
    public static void findIndices(int[] arr, int key, int idx) {
        if (idx == arr.length)
            return;
        if (arr[idx] == key) {
            System.out.print(idx + " ");
        }
        findIndices(arr, key, idx + 1);
    }

    public static String convertNumToStr(int num, String map[]) {
        // base case
        if (num == 0)
            return "";
        // main logic
        int lastDigit = num % 10;
        return convertNumToStr(num / 10, map) + map[lastDigit] + " ";
    }

    public static int substringCount(String str, int startIdx, int endIdx) {
        if (startIdx == str.length())
            return 0;
        if (endIdx == str.length())
            return substringCount(str, startIdx + 1, startIdx + 1);
        // main logic
        if ((startIdx == endIdx) || (str.charAt(startIdx) == str.charAt(endIdx)))
            return (1 + substringCount(str, startIdx, endIdx + 1));
        return substringCount(str, startIdx, endIdx + 1);
    }

    public static void towerOfHanoi(int n, int source, int helper, int destination) {
        if (n == 1) {
            System.out.println("move " + n + " from " + source + " to " + destination);
            return;
        }
        towerOfHanoi(n - 1, source, destination, helper);
        System.out.println("move " + (n) + " from " + source + " to " + destination);
        towerOfHanoi(n - 1, helper, source, destination);
    }

    public static void towerOfHanoi2(int n, int source, int destination) {
        // destination = 6-(source+destination);
        if (n == 1) {
            System.out.println("move " + n + " from " + source + " to " + destination);
        }
        towerOfHanoi2(n - 1, source, 6 - (source + destination));
        System.out.println("move " + n + " from " + source + " to " + destination);
        towerOfHanoi2(n - 1, 6 - (source + destination), destination);
    }

    public static void main(String[] args) {
        // findIndices(new int[] { 3, 2, 4, 5, 6, 2, 7, 2, 2 }, 2, 0);
        // int num = 20;// it recognize the value as octal(020)
        // String map[] = { "zero", "one", "two", "three", "four", "five", "six",
        // "seven", "eight", "nine" };
        // String strNum = convertNumToStr(num, map);
        // System.out.println(strNum);
        // System.out.println(substringCount("abcab", 0, 0));
        towerOfHanoi(4, 1, 2, 3);
    }
}
