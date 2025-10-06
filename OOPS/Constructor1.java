// Program to demonstration of call by Reference constructor.

class Data{
    int a,b;
    Data(){ // Default Constructor
        a=10;
        b=20;
        System.out.println("Data is created");

    }
    Data(Data D){ // call by reference Constructor
        a=D.a;
        b=D.b;
        System.out.println("Dublicate Copy of Consdtructor");
    }
    void swap(){
        int temp;
        temp=a;
        a=b;
        b=temp;
        
    }
    void showdata(){
        System.out.println("a= "+a);
        System.out.println("b= "+b);
    }

}

public class Constructor1 {
    public static void main(String[] args) {
        Data d1=new Data();
        Data d2=new Data(d1);
        d1.swap();
        System.out.println("Swaped Data");
        d1.showdata();
        System.out.println("Actual Data");
        d2.showdata();
    }
    
}
