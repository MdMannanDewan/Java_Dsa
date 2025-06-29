public class Factorial {
    public static int printNumInDecreasingOrder(int num) {
        System.out.print(num + " ");
        if (num == 1)
            return 0;
        return printNumInDecreasingOrder(num - 1);
    }

    public static void printIncrese(int num) {
        // System.out.print(count + " ");
        // if (count == num) {
        // return;
        // }
        // count++;
        // printIncrese(num, count);
        if (num == 1) {
            System.out.print(num + " ");
            return;
        }
        printIncrese(num - 1);
        System.out.print(num + " ");
    }

    public static int printFactorial(int n) {
        if (n == 1)
            return 1;
        return n * printFactorial(n - 1);
    }

    public static int sumOfN(int n) {
        if (n == 1)
            return 1;
        return n + sumOfN(n - 1);
    }

    public static void main(String[] args) {
        // printNumInDecreasingOrder(10);
        // printIncrese(10);
        // System.out.println(printFactorial(5));
        System.out.println(sumOfN(5));
    }
}