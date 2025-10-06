package Array;

import java.util.*;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Sort in ascending order
        Arrays.sort(arr);
        int Second=Integer.MIN_VALUE;

        System.out.println("Sorted Array in Ascending Order:");
        for (int num : arr) {
            System.out.println(num + " ");
            if(num<arr[1]&&num!=arr[1]){
               Second=arr[1];

            }
            
        }
        System.out.println("Second Larges Second= "+ Second);
       
      
    }
}
