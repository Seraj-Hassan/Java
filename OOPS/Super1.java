class Number{
    int a=30,b=40,c=35;
    
}
class Data extends Number{
     int a=50,b=60;
    void showData(){
        System.out.println("Sub class(Value)");
        System.out.println("a= "+a);
        System.out.println("b= "+b);
        System.out.println("Super class(Number)");
        System.out.println("a= "+super.a);
        System.out.println("b= "+super.b);
        System.out.println("c= "+c); 
    }
}
public class Super1 {
    public static void main(String[] args){
        Data ob=new Data();
        ob.showData();
        // new Value().showData();
    }    
}
