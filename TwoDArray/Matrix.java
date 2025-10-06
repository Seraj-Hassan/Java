import java.util.Scanner;

public class Matrix {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Rows: ");
        int rows=sc.nextInt();
        System.out.print("Enter Coloms: ");
        int cols=sc.nextInt();
        int[][] number=new int[rows][cols];
        for(int i=0;i<rows;i++){          // 1 2 3 4 5                        
            for(int j=0;j<cols;j++){
                number[i][j]=sc.nextInt();
            }
        }

        // output

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(number[i][j]+" ");
            }
            System.out.println();
        }
        
        
    
    }
}
