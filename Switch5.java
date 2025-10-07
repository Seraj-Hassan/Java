// WAP to compute 1 folling operation according user choice

import java.util.Scanner;

public class Switch5 {
    public static void main(String[] args) {
        int p,r,t;
        double res,TA,ci;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter p,r,t");
        p=sc.nextInt();
        r=sc.nextInt();
        t=sc.nextInt();
    
        System.out.println("1. Simple Interes\n2. Compound Interest");
         
        int choice=sc.nextInt();
        switch(choice){
            case 1:
            res=(p*r*t)/100;
            System.out.println("Simple Interst = "+res);
            break;

            case 2:
            TA=p*Math.pow((1+r/100.0),t);
            ci=TA-p;
            System.out.println("Compound Interest = "+ci);
            break;

            default:
            System.out.println("invalid numbber");
        }

    }
}
