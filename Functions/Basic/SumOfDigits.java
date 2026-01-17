//Calculates sum of digits of any integer>0 using Function, loops and conditional.
import java.util.Scanner;
public class Function {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer:");
        int digits = sc.nextInt();

        System.out.println("The sum is: " + SumDigits(digits));
    }

    public static int SumDigits(int n) {
        int sumOfDigits = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            sumOfDigits += lastDigit;
            n /= 10;
        }

        return sumOfDigits;
    }
}
