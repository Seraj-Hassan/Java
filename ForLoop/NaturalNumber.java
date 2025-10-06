import java.util.Scanner;

public class NaturalNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=sc.nextInt();
        int even=0;
        int odd=0;
        for(int i=1;i<=n;i++){
            System.out.println(i+" ");
            if(i%2==0){
                even=even+i;
            }
            else{
                odd=odd+i;
            }
        }
        System.out.println("Even Number : "+even);
        System.out.println("Odd Number: "+odd);
    }
}
