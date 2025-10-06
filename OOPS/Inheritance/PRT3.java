package Inheritance;


class Interest{
    int p,r,t;
    void getdata(int x,int y, int z){
        p=x;
        r=y;
        t=z;
    }
}
class SimpleIntrest extends Interest{
    double si;
    void findsi(){
        si=p*r*t/100;
        System.out.println("Simple interest = "+si);
    }
}
class CompundInterest extends Interest{
    double ci;
    double ta;
    void findCi(){
        ta=p*Math.pow((1+r/100.0), t);
        ci=ta-p;
        System.out.println("Compound Interest: "+ci);

    }
}

public class PRT3 {
    public static void main(String[] args) {
        CompundInterest C=new CompundInterest();
        SimpleIntrest S=new SimpleIntrest();
        C.getdata(15000, 500, 20);
        S.getdata(200, 5, 2);
        S.findsi();
        C.findCi();

    }
    
}
