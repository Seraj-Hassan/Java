
import java.util.Scanner;
public class Ques2 {
    
// Wep input Value of a , b and swap these b  values
    public static void main(String[] args) {
      int a,b,temp;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a");
      a=sc.nextInt();
      System.out.println("Enter b");
      b=sc.nextInt();
      temp=a;
      a=b;
      b=temp;
      System.out.println("Values after Swaping");
      System.out.println("a= "+a);
      System.out.println("a= "+b);


      
    }
}


