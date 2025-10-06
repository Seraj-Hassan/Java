//WAP to add two matrices and print the result.

import java.util.*;

public class AddOfTwoMatrices{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter row: ");
        int row=sc.nextInt();
        System.out.print("Enter coloms: ");
        int cols=sc.nextInt();
       
        int[][] a=new int[row][cols];
        int[][] b=new int[row][cols];
        int[][] sum=new int[row][cols];
        
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                b[i][j]=sc.nextInt();
            }
           
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
               sum[i][j]=a[i][j]+b[i][j];
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
         
    }
}