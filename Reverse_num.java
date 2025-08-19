 import java.util.Scanner;
public class Reverse_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int reverse = 0;

        // Reverse logic
        while (number != 0) {
            int digit = number % 10;      // get last digit
            reverse = reverse * 10 + digit; // append digit to reverse
            number = number / 10;         // remove last digit
        }

        System.out.println("Reversed number: " + reverse);
    }
}
