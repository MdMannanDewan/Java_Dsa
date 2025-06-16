import java.util.*;

public class SumOfEvenOrOddInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfInput = sc.nextInt();
        // sc.close();
        int sum_of_even_number = 0;
        int sum_of_odd_number = 0;
        for (int i = 0; i < numberOfInput; i++) {
            int number = sc.nextInt();
            if (number % 2 == 0) {
                sum_of_even_number += number;
            } else {
                sum_of_odd_number += number;
            }
        }
        sc.close();
        System.out.println(sum_of_even_number + "," + sum_of_odd_number);
    }
}
