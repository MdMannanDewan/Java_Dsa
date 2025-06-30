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

    public static void main(String[] args) {
        // findIndices(new int[] { 3, 2, 4, 5, 6, 2, 7, 2, 2 }, 2, 0);
        int num = 20;// it recognize the value as octal(020)
        String map[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        String strNum = convertNumToStr(num, map);
        System.out.println(strNum);
    }
}
