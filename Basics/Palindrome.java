public class Palindrome {
    public static boolean validPalindrome(int number) {
        int lastDigit, newNum = 0;
        for (int i = number; i > 0; i /= 10) {
            lastDigit = i % 10;
            // newNum += lastDigit * 10;
            newNum = newNum * 10 + lastDigit;
        }
        return (newNum == number) ? true : false;
    }

    public static void main(String[] args) {
        System.out.println(validPalindrome(231));
    }
}
