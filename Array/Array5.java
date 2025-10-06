//Sum of Element in array

package Array;
import java.util.*;
public class Array5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array size");
        int size=sc.nextInt();
        int[] num=new int[size];
        for(int i=0;i<num.length;i++){
            num[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<num.length;i++){
            sum=sum+num[i];
        }
        System.out.println("Sum Number = "+sum);

    }
}
