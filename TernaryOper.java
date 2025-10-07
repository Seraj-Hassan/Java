// Wap to input 2 number and find Largest element using condition Operator
import java.util.*;
public class TernaryOper {
    
    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number a");
        a=sc.nextInt();
        System.out.println("Enter Number b");
        b=sc.nextInt();
       int res=(a<b)?a:b;
       System.out.println("Largest number"+res);
    }
}
