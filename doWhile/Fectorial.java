package doWhile;

import java.util.Scanner;

public class Fectorial {
    public static void main(String[] args) {
        int i=1;
        int f=1;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        do { 
            f=f*i;
            i++;
            
        } while (i<n);
       System.out.println(f);
       
        
            //factorial = n*(n-i);
        
    }
}
