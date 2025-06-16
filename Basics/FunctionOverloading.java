public class FunctionOverloading {
    public static int Sum(int a, int b) {
        return a + b;
    }

    public static int Sum(int a, int b, int c) {
        return a + b + c;
    }

    public static float Sum(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(Sum(3, 4));
        System.out.println(Sum(4, 5, 6));
        System.out.println(Sum(5.3f, 4.7f));
    }
}
