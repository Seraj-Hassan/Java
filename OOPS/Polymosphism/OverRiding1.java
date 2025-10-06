package Polymosphism;

class Base{
    int b=10,c=30;
    void display(){
        System.out.println("this is derived class method");
        System.out.println("b= "+b);
        System.out.println("a= "+c);

      
    }
}
class Derived extends Base{
    int a=20;
    void display(){  // override
         System.out.println("this is base class mathod");
        System.out.println("a= "+a);

    }
}
public class OverRiding1 {
    public static void main(String[] args) {
        Derived D=new Derived();
        D.display();
    }
    
}
