//wap to input values of p,r,t and compute value of compund 
import java.util.*;
public class Ques4 {
    public static void main(String[] args) {
        int p,r,t;
        double ta;
        double ci;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter p");
        p=sc.nextInt();
        System.out.println("Enter r");
        r=sc.nextInt();
        System.out.println("Enter t");
        t=sc.nextInt();
        ta =p*Math.pow((1+r/100.0),t);
        ci=ta-p;
        System.out.println("ta = "+ta);
        System.out.println("ci = "+ci);
        

    }
   
}
