
import java.util.Scanner;

public class Exception4 {
    public static void main(String[] args){
        int ar[]=new int[10];
        int index,n;
        Scanner sc=new Scanner(System.in);
        try {
            System.out.println("Enter the index and element ");
            index=sc.nextInt();
            n=sc.nextInt();
            ar[index]=n/index;
            System.out.println("Succes..............");
            
        } 
        catch(ArithmeticException ae){
            System.out.println("It can not devied by 0");
        }
        catch(ArrayIndexOutOfBoundsException ae){
            System.out.println("Invalid Index");
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("End of program");
    }
}
