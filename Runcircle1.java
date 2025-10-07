
import java.util.Scanner;

class Circle{
    double r,ar,cr;
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius");
        r=sc.nextDouble();
    }
    void area(){
        ar=Math.PI*r*r;
        System.out.println("area= "+ar);
    }
    void circum(){
        cr=2*Math.PI*r;
        System.out.println("circum= "+cr);
    }
}
public class Runcircle1 {
    public static void main(String[] args) {
        Circle obj=new Circle();
        obj.input();
        obj.area();
        obj.circum();
    }
    
}
