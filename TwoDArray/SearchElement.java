
import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args){
        int a[]=new int[10];
        int n,i;
        boolean flag=true;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 Element");
        for ( i = 0; i < 10; i++) {
            a[i]=sc.nextInt();
            
        }
        System.out.println("Enter the Number to be Search");
        n=sc.nextInt();
        for(i=0;i<10;i++){
            if(n==a[i]){
                System.out.println("Element is found");
                flag=false;
                break;
            }
           
        }
         if(flag)
            System.out.println("Element is not foud");
    }
}
