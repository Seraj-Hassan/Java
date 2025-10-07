import java.util.Scanner;

public class ThreeTriangle {
    public static void main(String[] args) {
        int a,b,c;
        double s;
        double area;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 side of tringle(a, b, c)");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        s=(a+b+c)/2;
        System.out.println(s);
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of tringle = "+area);


    }
}
