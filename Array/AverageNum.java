package Array;

import java.util.Scanner;

public class AverageNum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size = ");
        int n=sc.nextInt();
        int sum=0;
        int[] arr=new int[n];
        System.out.println("Enter Element:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        double average=(double) sum/n;
        System.out.println("Average Element = "+average);
        



    }
}
