// find largest number..

import java.util.*;
class LargestNumber{
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number a,b,c");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        int res=(a>b)?((a>c)?a:c):((b>c)?b:c);
        System.out.println("Largest Number = "+res);
       
        

    }
}