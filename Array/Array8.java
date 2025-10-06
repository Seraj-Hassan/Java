//Reverse an array
package Array;

import java.util.Scanner;

public class Array8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array length");
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]+" "); 
        }

                      
    }                 
    
}
    