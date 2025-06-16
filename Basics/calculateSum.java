import java.util.*;

public class calculateSum {
    public static int Sum(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int sum = Sum(a, b);
        System.out.println(sum);
    }
}
