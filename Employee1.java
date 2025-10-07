
import java.util.Scanner;

public class Employee1 {
    public static void main(String[] args) {
        int code;
        String name;
        float salary;
        Scanner sc=new Scanner(System.in );
        System.out.println("Enter Employee coe, Employee name , Enter salary");
        code=sc.nextInt();
        name=sc.next();
        salary=sc.nextFloat();
        System.out.println("Employee Code"+code);
        System.out.println("Employee Name "+name);
        System.out.println("Enter salary "+salary);

    }
}
