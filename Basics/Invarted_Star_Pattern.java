import java.util.*;

public class Invarted_Star_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        int number_of_row = sc.nextInt();
        for (int i = 0; i < number_of_row; i++) {
            for (int j = 0; j < (number_of_row - i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
