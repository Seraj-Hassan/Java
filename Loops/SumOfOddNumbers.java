import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer n: ");
        int n = sc.nextInt();
        
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) { // check if i is odd
                sum += i;
            }
            
        }
        System.out.println("Sum of odd numbers from 1 to " + n + " is: " + sum);
        
        
        sc.close();
    }
}
