import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();
        for(int i=2;i<=n;i++){
            boolean number=true;
            for(int j=2;j<=i/2;j++){
                 if(i%j==0){
                    number=false;
                    break;
                }
            }
            if(number){
                System.out.print(i+" ");
            }
        }
    }
}
