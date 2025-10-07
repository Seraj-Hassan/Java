
import java.util.Scanner;

// WAP to input coefficient of quadratic Equation and compute its root

public class ControleState4 {
    public static void main(String[] args) {
        int a,b,c;
        double r1,r2,d;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number ,b,c");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=b*b-4*a*c;
        if(d>0)
        {
            r1=(-b+Math.sqrt(d))/(2*a);
            r2=(-b-Math.sqrt(d))/(2*a);
            System.out.println("Root 1"+r1);
            System.out.println("Root2 "+r2);

        }
    
    }
}
