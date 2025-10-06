
import java.util.Scanner;

public class oneton {
    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=10;j++){
                t=i*j;
                System.out.print(t+" ");
                
            }
            System.out.println();
           
        }
    }
}
