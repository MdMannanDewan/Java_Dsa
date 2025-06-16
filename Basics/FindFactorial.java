public class FindFactorial {
    public static int Factorial(int number) {
        if (number == 1)
            return 1;
        if (number == 2)
            return 2;
        return number * Factorial(number - 1);
    }

    public static int BionomialCoefficiant(int n, int r) {
        int factorialOfN = Factorial(n), factorialOfR = Factorial(r), factorialOfDifferenceOfNandR = Factorial(n - r);
        return factorialOfN / (factorialOfR * factorialOfDifferenceOfNandR);
    }

    public static void main(String[] args) {
        int a = Factorial(7);
        System.out.println(a);
        int bionomialCoefficiant = BionomialCoefficiant(5, 3);
        System.out.println(bionomialCoefficiant);
    }
}
