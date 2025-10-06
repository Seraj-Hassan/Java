// Convert rows into columns and columns into rows
import java.util.*;
public class TransposeofMatrix {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Row: ");
        int row=sc.nextInt();
        System.out.print("Enter Coloms: ");
        int cols=sc.nextInt();
        int[][] number=new int[row][cols];
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                number[i][j]=sc.nextInt();

            }
        }
        // for (int i = 0; i < row; i++) {
        //     for (int j = 0; j < cols; j++) {
        //        System.out.print(number[i][j]+" ");
                
        //     }
        //     System.out.println();
            
        
        // }
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(number[j][i] + " ");
            }
            System.out.println();
        }  
        

    }
    
}
