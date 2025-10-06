package Polymosphism;

class Dimension{
    double ar;
    void area(double  r){
        ar=Math.PI*r*r;
        System.out.println("Area of circle= "+ar);
    }
    void area(int a){
        ar=a*a;
        System.out.println("Area of Circle= "+ar);

    }
    void area(int a, int b){
        ar=a*b;
        System.out.println("Area of Rectangle= "+ar);
    }
    void area(int a, int b, int c){
        double s=(a+b+c)/2.0;
        ar=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of traingle = "+ar);
    }
}

public class Overloading {
    public static void main(String[] args) {
        Dimension D=new Dimension();
        D.area(2.4);
        D.area(4);
        D.area(3,4);
        D.area(2,4,5);
    }
}
