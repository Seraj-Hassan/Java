package Inheritance;

class Dimension{
    int a,b;
    void getdata(int x,int y){
        a=x;
        b=y;
    }
}
class Rectangle extends Dimension{
    int ar;
    void areaRect(){
        ar=a*b;
        System.out.println("Area of Rectangle= "+ar);
    }
}
class Triangle extends  Dimension{
    double ar;
    void areaTr(){
        ar=a*b/2.0;
        System.out.println("Area of triangle= "+ar);
    }
}


public class AreaOfShap {
    public static void main(String[] args) {
        Triangle  s1=new Triangle();
        s1.getdata(5,4 );
        s1.areaTr();
        Rectangle s2=new Rectangle();
        s2.getdata(2, 4);
        s2.areaRect();

        
    }
    
}
