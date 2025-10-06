//WAP to input a Number and Find Factorial of a Number.
import  java.util.*;
class Factorial {
    int n;
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        n=sc.nextInt();
    }
    void findFactorial(){
        long fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;

        }
        System.out.print("fectorial of n: "+fact);
    }
    
    
}

public class Factori
{
    public static void main(String[] args) {
        Factorial obj=new Factorial();
        obj.input();
        obj.findFactorial();
        
    }
    
}
