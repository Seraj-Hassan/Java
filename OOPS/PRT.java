
import java.util.Scanner;

class Interest{
    double p,r,t,si,ci,ta;
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter P, r, t valve");
        p=sc.nextDouble();
        r=sc.nextDouble();
        t=sc.nextDouble();
    }
    void findSi(){
        si=(p+r+t)/100;
        System.out.println("Simple Interest: "+si);
       
    }
    void findCi(){
        ta=p*Math.pow((1+r/100), t);
        ci=ta-p;
        System.out.println("Compound Interest: "+ci);
    }
}

public class PRT {
    public static void main(String[] args) {
        Interest obj=new Interest();
        obj.input();
        obj.findSi();
        obj.findCi();
    }
    
}
