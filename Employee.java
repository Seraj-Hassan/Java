
import java.io.*;

public class Employee {
    public static void main(String[] args)throws IOException {
        int code;
        String name;
        float salary;
        DataInputStream ds=new DataInputStream(System.in);
        System.out.println("Enter Employee Code , Name, salar1y");
        code=Integer.parseInt(ds.readLine());
        name=ds.readLine();
        salary=Float.parseFloat(ds.readLine());
        System.out.println("Employee Name"+name);
        System.out.println("Employee Code"+code);
        System.out.println("Employee salary"+salary);

    }
}
