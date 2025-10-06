package doWhile;

import java.util.Scanner;


public class evenSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=sc.nextInt();
        int i=1;
        int sum=0;
        do { 
            if(i%2==0){
                sum=sum+i;
                
            }
            i++;
        } while (i<=n);
        System.out.print("Sum of all Enen Number: " +sum);
    }
    
}
