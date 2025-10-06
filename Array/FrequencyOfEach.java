package Array;

import java.util.Scanner;

public class FrequencyOfEach {
    public static void main(String[] args) {
        
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter Size : ");
       int n=sc.nextInt();
       int[] arr=new int[n];
       System.out.println("Enter Number");
       for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
       }
       boolean[] visite=new boolean[n];
       for(int i=0;i<n;i++){
        if(visite[i]) continue; //Skieped the allready Counted
        int count=1;
        for(int j=i+1;j<n;j++){
            if(arr[i]==arr[j]){
                count++;
                visite[j]=true;
            }
            
        }
        System.out.println(arr[i] + " occurs " + count + " times");
        
       }


       
    }
}
