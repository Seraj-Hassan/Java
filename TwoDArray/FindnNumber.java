import java.util.*;

public class FindnNumber {
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
        System.out.print("Find Number: ");
        int x=sc.nextInt();

        for(int i=0;i<rows;i++){
            for(int j=0;j<coloms;j++){
                if(number[i][j]==x){
                System.out.println("X found location: ("+i+","+j+")");
                }
            }
          

        }

        
    }
}
