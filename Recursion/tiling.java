import java.util.*;

public class tiling {
    public static int numOfWays(int n) {
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        return numOfWays(n - 1) + numOfWays(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(numOfWays(n));
    }
}
