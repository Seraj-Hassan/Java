package Inheritance;

class Base{  // base class
    private int a; // it can not be inherit
    int b; // default
    protected int c;
    public int d;
    void geta(int x){ // method
        a=x;
    }
    void getbcd(int x,int y,int z){
        b=x;
        c=y;
        d=z;
    }
    void puta(){
        System.out.println("a= "+a);
    }
    void putbcd(){
        
        System.out.println("b= "+b);
        System.out.println("c= "+c);
        System.out.println("d= "+d);
    } 
    
}
 class Derived extends Base{ // derived class
        int e,f;
        void getef(int x,int y){
            e=x;
            f=y;
        }
        void showAll(){
            System.out.println("Base class Data");
            //System.out.println("a= "+a);
            System.out.println("b= "+b);
            System.out.println("c= "+c);
            System.out.println("d= "+d);
            System.out.println("Derived class");
            System.out.println("e= "+e);
            System.out.println("f= "+f); 
        }
    }

public class TestInheritance {
    public static void main(String[] args) {
        Base B=new Base();
        Derived D=new Derived();
        B.geta(10);
        B.getbcd(20,30,40);
        D.getbcd(55,65,75);
        D.getef(85,95);
        B.puta();
        B.putbcd();
        D.showAll();
    }
    
}
