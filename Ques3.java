
// Wap  to input an ammount and distribute this amount in minmum number of notes

import java.util.*;
public class Ques3 {
    public static void main(String[] args) {
        int w,h,d;
        double area;
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter w");
        w=sc.nextInt();
        System.out.println("Enter h");
        h=sc.nextInt();
         System.out.println("Enter d");
        d=sc.nextInt();
       
        area=(w*h+h*d+w*d);
        System.out.println(area);

        
    }
    
}
