import java.util.*;

public class CharPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfRow = sc.nextInt();
        sc.close();
        int count = 0;
        for (int i = 1; i <= numberOfRow; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (65 + count));
                count++;
            }
            System.out.println();
        }
    }
}