package Inheritance;

 class SeriesA{
    int n,a,d;
    void getdata(int x,int y ,int z){
        a=x;
        d=y;
        n=z;
    }
}
class SeriesB extends SeriesA{
    int i,T;
    void finddata(){
        for(i=0;i<n;i++){
            T=(int)(a*Math.pow(d,i));
            System.out.println(T);
        }
    }
}
public class GPSeries {
    public static void main(String[] args){
        SeriesB s1=new SeriesB();
        s1.getdata(4, 5, 6);
        s1.finddata();

    }
}
