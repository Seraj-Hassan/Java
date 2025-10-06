import java.util.Scanner;

public class HalfPyNumber {
    public static void main(String[] arge){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
