/*WAP to find 1 of following Operation accordinguser’s choice
1.Area of Circle = pi*r^2
2. Area of Rectangle = w*l
3.Area of Square  = a^2
4.Area of Triangle  = (1/2)*b*h*/ 


import java.util.*;
public class Switch2 {
    public static void main(String[] args) {
        int r,w,l,a,b,h,choice;
        double area;
        Scanner sc=new Scanner(System.in);
        
        
        System.out.println("1. Area of Circle\n2. Area of Rectangle\n3. Area of Square\n4. Area of Triangle");
        System.out.print(" Enter number = ");
        choice=sc.nextInt();
        switch(choice){
            case 1:
            System.out.print("Enter radius of circle = ");
            r=sc.nextInt();
            area=Math.PI*r*r;
            System.out.println("Area of circle = "+area);
            break;

            case 2:
            System.out.print("Enter width of rectangle = ");
            w=sc.nextInt();
            System.out.print("Eneter lenght of rectangle = ");
            l=sc.nextInt();
            area=w*l;
            System.out.println("Area of rectangle = "+area);
            break;

            case 3:
            System.out.print("Enter area = ");
            a=sc.nextInt();
            area=a*a;
            System.out.println("Area of square = "+area);
            break;

            case 4:
            System.out.print("Enter base of triangle = ");
            b=sc.nextInt();
            System.out.print("Enter height of triangle = ");
            h=sc.nextInt();
            area=0.5*(b*h);
            System.out.println("Area of triangle = "+area);
            break;

            default :
            System.out.println("Invalid Number");
        }



    }
}
