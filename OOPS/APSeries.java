
import java.util.Scanner;

/*Wap to input values a,d,n of AP Series using Constructor and generate APSeries. */
class Series{
    int a,d,n,i,T;

    Series(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a,d,n");
        a=sc.nextInt();
        d=sc.nextInt();
        n=sc.nextInt();
    }
    void printAP(){
        for(i=0;i<n;i++){
            T=a+i*d;
            System.out.println(T);
        }
    }
}

public class APSeries {
    public static void main(String[] args) {
        Series obj=new Series();
        obj.printAP();
    
    }
    
}
