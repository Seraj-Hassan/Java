// 0,1,1,2,3,5,.....n

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print(" Eneter Number");
        int n=sc.nextInt();
        int a,b,c;
        a=-1;
        b=1;
        for(int i=0;i<=n;i++){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;

        }
     
        
    }
}
