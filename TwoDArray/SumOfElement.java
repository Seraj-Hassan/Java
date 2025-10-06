import java.util.*;

public class SumOfElement {
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter rows: ");
        int row=sc.nextInt();
        System.out.print("Enter coloms: ");
        int cols=sc.nextInt();
        int[][] number=new int[row][cols];
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                number[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                sum=sum+number[i][j];
            }
        }
        System.out.println("Sum of all element: "+sum);

    }
}
