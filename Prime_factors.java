import java.util.Scanner;

public class Prime_factors{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        System.out.print("Prime factors of " + num + " are: ");
        
        // Factor out 2s
        while (num % 2 == 0) {
            System.out.print(2 + " ");
            num /= 2;
        }
        
        // Factor out odd numbers from 3 onwards
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            while (num % i == 0) {
                System.out.print(i + " ");
                num /= i;
            }
        }
        
        // If num is still > 2, it's a prime factor
        if (num > 2) {
            System.out.print(num);
        }
        
        sc.close();
    }
}
