import java.util.*;

public class StarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number_of_row = sc.nextInt();
        sc.close();
        for (int i = 0; i < number_of_row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
