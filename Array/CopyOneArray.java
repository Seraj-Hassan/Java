// copy one array to another 
package Array;

import java.util.Scanner;

public class CopyOneArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array Size");
        int num=sc.nextInt();
       
        int[] arr1=new int[num];
        int[] arr2=new int[num]; 
          // new array
          System.out.println("Enter Element");
        for(int i=0;i<num;i++){
            arr1[i]=sc.nextInt();
        }
        //copy
        for(int i=0;i<num;i++){
          arr2[i]=arr1[i];

        }
        //array copied
        System.out.println("Copied array");
        for(int i=0;i<num;i++){
            System.out.println(arr2[i]+" ");
        }
        
    }
}
