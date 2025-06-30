public class FriendsPairingProblem {
    public static int getTotalWay(int n) {
        // base case
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        // main logic
        int single = getTotalWay(n - 1);
        int pair = getTotalWay(n - 2);
        return single + (n - 1) * pair;
    }

    public static void main(String[] args) {
        System.out.println(getTotalWay(6));
    }
}
