//Count the odd and even number
package Array;

import java.util.Scanner;

public class Array7{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array Size");
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int odd=0;
        int even=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Odd number "+odd);
        System.out.println("Even Number "+even);

    }
}