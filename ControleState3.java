// Second Largest Number

import java.util.Scanner;

public class ControleState3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 Number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b&&a>c){
            if(b>c)
            System.err.println("Second Largest Number = "+b);
            else 
            System.out.println("Second Largest Number = "+c);

        }
        else if(b>c){
            if(a>c)
            System.out.println("Second Largest Number = "+a);
            else
            System.out.println("Second Largest Number = "+c);

        }
        else{
            if(a>b)
            System.out.println("Second Largest Number = "+a);
            else
             System.out.println("Second Largest Number = "+b);

        }

    }
}
