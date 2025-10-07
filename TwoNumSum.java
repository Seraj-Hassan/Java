import java.io.*;

public class TwoNumSum {
    public static void main(String[] args)throws IOException {
       
        DataInputStream ds=new DataInputStream(System.in);
        int num1=Integer.parseInt(ds.readLine());
        int num2=Integer.parseInt(ds.readLine());
        int sum=num1+num2;

        
        System.out.println(sum);

    }
}
