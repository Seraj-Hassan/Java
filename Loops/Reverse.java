
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner rever=new Scanner(System.in);
        System.out.println("Enter your Number");
        int n=rever.nextInt();
        for(int i=10;i>=n;i--){
            System.out.println(i+" ");

        }
        rever.close();
    }
    
}
