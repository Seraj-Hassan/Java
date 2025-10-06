package doWhile;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        String num=sc.nextLine();
        String rev="";
        int i=num.length()-1;
        do { 
            rev = rev+num.charAt(i);
            i--;
        } while (i>=0);
        System.out.print("Reverse Number: "+rev);
       
       
    }
    
}
