// Wap to print factor which is prime,
import java.util.Scanner;

public class PrimeFactors {
    // method to check prime
    static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Prime factors of " + n + " are: ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
