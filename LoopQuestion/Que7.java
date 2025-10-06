import java.util.Scanner;

public class Que7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();
        int num=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                num=i;
                System.out.print(num+" ");

            }
            if(num%i!=0){

                System.out.print(num+" ");
            }
        }

       
        
    }
}
