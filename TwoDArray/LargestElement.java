import java.util.*;

public class LargestElement {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in); 
        System.out.print("Enter row number: ");
        int row=sc.nextInt();
        System.out.print("Enter coloms number: ");
        int cols=sc.nextInt();
        int[][] number=new int[row][cols];
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
               number[i][j]=sc.nextInt();  
            }
        }
        int largest = number[0][0];
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                if(number[i][j]>largest){
                    largest=number[i][j];
                }
            }
        }
        System.out.print("Largest Element: "+largest);
    }
}
