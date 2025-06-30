public class BinaryString {
    public static void printBinaryString(int n, int lastPlace, String str) {
        // base case
        if (n == 0) {
            System.out.println(str);
            return;
        }
        // main logic
        printBinaryString(n - 1, 0, str + "0");
        if (lastPlace == 0) {
            printBinaryString(n - 1, 1, str + "1"); // string builder doesn't create new string it refers to old value
        }

    }

    public static void main(String[] args) {
        printBinaryString(3, 0, "");
    }
}
