import java.util.Scanner;

public class Factor {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();
        int even=0;
        int odd=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                if(i%2==0){
                    even=even+i;
                }
                else{
                    odd=odd+i;
                }
                
            }
           
        }
        System.out.println("Sum of odd Even Number: "+(even+odd));
        System.out.println("even number: "+even);
        System.out.println("odd number: "+odd);

    }
}
