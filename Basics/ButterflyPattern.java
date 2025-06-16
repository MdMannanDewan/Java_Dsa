import java.util.*;

public class ButterflyPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n; j++) {
                if (j <= i || j >= n - 1 - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n; j++) {
                if (j <= n / 2 - i - 1 || j >= n / 2 + i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
