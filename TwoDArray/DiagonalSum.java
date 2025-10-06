import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.print("Enter Rows: ");
        int rows=sc.nextInt();
        System.out.print("Enter coloms:");
        int coloms=sc.nextInt();
        int[][] number=new int[rows][coloms];
        for(int i=0;i<rows;i++){
            for(int j=0;j<coloms;j++){
                number[i][j]=sc.nextInt();

            }
        }
        int primary=0, secondery=0;
        for(int i=0;i<rows;i++){
            primary+=number[i][i];
            secondery+=number[i][rows-i-1];

        }
        System.out.println("diagonalsum1: "+primary);
        System.out.println("diagonalsum: "+secondery);
    }
}
