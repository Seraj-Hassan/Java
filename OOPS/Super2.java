

class Base{
    int a=10;
    void display(){
        System.out.println("a= "+a);

    }
}
class Derived extends Base{
    int a=45,b=30;
    void display(){
        System.out.println("a= "+a);
        System.out.println("b= "+b);
    }
    void showData(){
        super.display();
        display();
    }

}

public class Super2 {
    public static void main(String[] args) {
        Derived D=new Derived();
        D.showData();
        
    }
    
}
