import java.util.*;

public class RowWiseandColsWiseSum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter row: ");
        int row=sc.nextInt();
        System.out.print("Enter coloms: ");
        int cols=sc.nextInt();
        int[][] number=new int[row][cols];
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                number[i][j]=sc.nextInt();
            }
        }
        
    
        for(int i=0;i<row;i++){
            int rowSum=0;
            for(int j=0;j<cols;j++){
               rowSum=rowSum+number[i][j];
               
            }
             System.out.println("Sum of all row Element: "+rowSum);
        }
           
        for(int j=0;j<cols;j++){
             int colSum=0;
            for(int i=0;i<row;i++){
                colSum=colSum+number[i][j];

            }
            System.out.println("Sum of col number: "+colSum);
        }
        sc.close();
       
        

    }
}
