
import java.util.Scanner;

public class ControleState1 {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n==0){
            System.out.println("0");
        }
        else if(0<n){
            System.out.println("poitive Number");
        }
        else{
            System.out.println("negative number");
        }
        sc.close();
    }
}
