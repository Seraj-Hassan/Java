// Smallest Number
import java.util.Scanner;

public class ControleState5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr Number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a<b && a<c){
            System.out.println("Smallest Number = "+a);
        }
        else if(b<c){
            System.err.println("Smallest Number = " +b);
        }
        else{
            System.out.println("Smallest Number = "+c);
        }
    }
}
