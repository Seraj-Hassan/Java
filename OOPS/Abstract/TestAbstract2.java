package Abstract;


abstract  class Series{
    int a,b,n;

    Series() {
    a=3;
    b=2;
    n=5;
    }
    abstract void printSeries();
    
}

class ApSeries extends Series{
    int T,i;
    void printSeries(){
        System.out.println("Ap Series");
        for(i=0;i<n;i++){
            T=a+i*b;
            System.out.println(T);
        }
    }
}
class GPSeries extends Series{
    int T,i;
    void printSeries(){  // override
        System.out.println("Gp Series");
        for(i=0;i<n;i++){
            T=(int) (a*Math.pow(b,i));
            System.out.println(T);
        }
    }
}

public class TestAbstract2 {
    public static void main(String[] args){
        GPSeries gp=new GPSeries(); 
        ApSeries ap=new ApSeries();
        gp.printSeries();
        ap.printSeries();

    }
    
}
