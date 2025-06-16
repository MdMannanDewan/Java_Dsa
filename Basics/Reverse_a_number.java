import java.util.*;

public class Reverse_a_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number which you want to reverse:");
        int number = sc.nextInt();
        sc.close();
        int reverse_number = 0;
        // while (number > 0) {
        // int last_digit = number % 10;
        // number /= 10;
        // reverse_number = reverse_number * 10 + last_digit;
        // }
        // System.out.println("The reversed number is:" + reverse_number);

        for (int i = number; i > 0; i /= 10) {
            int last_digit = i % 10;
            reverse_number = reverse_number * 10 + last_digit;
        }
        System.out.println("The reversed number is:" + reverse_number);
    }
}
