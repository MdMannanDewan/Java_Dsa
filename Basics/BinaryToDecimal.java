import java.util.*;

public class BinaryToDecimal {
    public static int binaryToDecimal(int number) {
        int decimal = 0, pow = 0, lastDigit;
        for (int i = number; i > 0; i /= 10) {
            lastDigit = i % 10;
            decimal += lastDigit * Math.pow(2, pow);
            pow++;
        }
        return decimal;
    }

    public static int decimalToBinary(int number) {
        int binary = 0, pow = 0, remainder;
        for (int i = number; i > 0; i /= 2) {
            remainder = i % 2;
            binary += remainder * Math.pow(10, pow);
            pow++;
        }
        return binary;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int binaryNumber = sc.nextInt();
        int decimalNumber = sc.nextInt();
        sc.close();
        int convertedDecimalNumber = binaryToDecimal(binaryNumber);
        int convertedBinaryNumber = decimalToBinary(decimalNumber);
        System.out.println(convertedDecimalNumber + "," + convertedBinaryNumber);
    }
}
