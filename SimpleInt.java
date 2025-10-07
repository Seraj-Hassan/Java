
import java.io.*;

public class SimpleInt {
    public static void main(String[] args)throws IOException {
        int p;
        Double r;
        Double t;
        Double si;
        DataInputStream ds=new DataInputStream(System.in);
        System.err.println("Enter  Number");
        p=Integer.parseInt(ds.readLine());
        r=Double.parseDouble(ds.readLine());
        t=Double.parseDouble(ds.readLine());
         si = p*r*t/100;
        System.out.println(si);
    }
}
