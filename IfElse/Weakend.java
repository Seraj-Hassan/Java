package IfElse;
// If the number is between 1 and 7, print the day of the week (1 = Monday, 2 = Tuesday, ... 7 = Sunday).
// If the number is divisible by both 3 and 5, print "Weekend Special!".
// If the number is outside 1–7, print "Invalid Input".

import java.util.*;
public class Weakend {
    public static void main(String[] args) {
        int n;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Number 1-7");
      n=sc.nextInt();
      if(n>=1 && n<=7){
        if(n==6 && n==7){
            System.out.println("Weekend Special");
        }
        else if(n==1)
        System.out.println("Monday");
        else if(n==2)
        System.out.println("Tuesday");
        else if(n==3)
        System.out.println("Wednesday");
        else if(n==4)
        System.out.println("Thurseday");
        else if(n==5)
        System.out.println("Friday");
        else if(n==6)
        System.out.println("Saturdey");
        else
        System.out.println("Sunday");
       
      }
       else
        System.out.println("Inavlid Input");
        

        
    }
}
