package doWhile;
import java.util.*;
public class PrimeNumber {
    public static void main(String[] args) {
        int i=2;
        int flag=0;

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=sc.nextInt();
        do { 
            if(n%i==0){
                flag++;
                break;
            }
            i++;
        } while (i<n);
        if(flag==0){
            System.out.print("Prime Number");
        }
        else{
            System.out.print("Not Prime Number");
        }

    }
}
