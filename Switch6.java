import java.util.Scanner;

public class Switch6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner((System.in));
        System.out.println("Enter the Employee Code");
        int code=sc.nextInt();
       switch(code){
        case 100:
        System.out.println("5");
        break;

        case 200:
        System.out.println("1");
        break;

        case 300:
        System.out.println("4");
        break;

        case 400:
        System.out.println("25");
        break;
         
        default:
        System.out.println("Invalid Employee code");

       }
    }
}
