import java.util.*;
public class ControleState {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n%2 == 0)
        {
            System.out.println("Even Number");

        }
        else{
            System.out.println("Odd Nuumber");
        }
        sc.close();

    }
}
