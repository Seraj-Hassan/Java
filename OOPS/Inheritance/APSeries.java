package Inheritance;

class Series{
    int n,a,d;
    void getdata(int x,int y ,int z){
        a=x;
        d=y;
        n=z;
    }
}
class Series2 extends Series{
    int i,T;
    void finddata(){
        for(i=0;i<n;i++){
            T=a+i*d;
            System.out.println(T);
        }
    }
}

public class APSeries {
    public static void main(String[] args){
         Series2 s1=new Series2();
         s1.getdata(4, 5, 6);
         s1.finddata();
    }
}
