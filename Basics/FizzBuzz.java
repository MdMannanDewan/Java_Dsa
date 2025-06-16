import java.util.*;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        int fizz = 0;
        int buzz = 0;
        // for (int i = 1; i <= N; i++) {
        // if (i % 3 == 0 && i % 5 == 0) {
        // System.out.print("FizzBuzz" + " ");
        // } else if (i % 3 == 0) {
        // System.out.print("Fizz" + " ");
        // } else if (i % 5 == 0) {
        // System.out.print("Buzz" + " ");
        // } else {
        // System.out.print(i + " ");
        // }
        // }
        // for (int i = 1; i <= N; i++) {
        // fizz++;
        // buzz++;
        // if (fizz == 3 && buzz == 5) {
        // System.out.print("FizzBuzz" + " ");
        // fizz = 0;
        // buzz = 0;
        // } else if (fizz == 3) {
        // System.out.print("fizz" + " ");
        // fizz = 0;
        // } else if (buzz == 5) {
        // System.out.print("buzz" + " ");
        // buzz = 0;
        // } else
        // System.out.print(i + " ");
        // }

        for (int i = 1; i <= N; i++) {
            fizz++;
            buzz++;
            if ((fizz != 3) && (buzz != 5)) {
                System.out.print(i + " ");
            } else if (fizz == 3) {
                System.out.print("fizz" + " ");
                fizz = 0;
            }
            if (buzz == 5) {
                System.out.print("buzz" + " ");
                buzz = 0;
            }
        }
    }
}
