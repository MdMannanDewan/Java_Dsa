import java.util.*;

public class IsPrime {
    public static boolean isPrime(int number) {
        if (number == 2)
            return true;
        double sqrtOfNumber = Math.sqrt(number);
        for (int i = 2; i <= sqrtOfNumber; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeInRange(int number) {
        for (int i = 2; i <= number; i++) {
            if (isPrime(i))
                System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        // boolean isPrime = true;
        // if (number == 2) {
        // System.out.println(number + " is a prime number");
        // }
        // for (int i = 2; i <= Math.sqrt(number); i++) {
        // if (number % i == 0) {
        // System.out.println(number + " is a not a prime number");
        // isPrime = false;
        // break;
        // }
        // }
        // if (isPrime && number > 2) {
        // System.out.println(number + " is a prime number");
        // }
        System.out.println(isPrime(number));
        primeInRange(number);
    }
}
