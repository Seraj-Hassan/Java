class SimpleInterest{
    int p,r,t;
    double si;
    SimpleInterest(){
        p=100;
        r=30;
        t=3;

    }
    SimpleInterest(int x,int y,int z){
        p=x;
        r=y;
        t=z;

    }
    SimpleInterest(SimpleInterest s){
        p=s.p;
        r=s.r;
        t=s.t;
    }
    void FindSi(){
        si=(p*r*t/100);
        System.out.println("Simple interest= "+si);

    }

}


public class PRT2 {
    public static void main(String[] args) {
        SimpleInterest s1=new SimpleInterest();
        SimpleInterest s2=new SimpleInterest(400,3,4);
        SimpleInterest s3=new SimpleInterest(s2);
        s1.FindSi();
        s2.FindSi();
        s3.FindSi();
    }
    
}
