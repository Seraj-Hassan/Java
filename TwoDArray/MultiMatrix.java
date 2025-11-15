import java.util.Scanner;

class MultiMatrix{
    public static void main(String[] args){
        int a[][]=new int[3][3];
        int b[][]=new int[3][3];
        int c[][]=new int[3][3];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter MAtrix 1 of 3*3 Order");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter Matrix 2 of 3*3 order");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("Multiplication");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                    c[i][j]=c[i][j]+a[i][k]*b[k][j];
                }
                System.out.print(c[i][j]+"\t");
            }
            System.out.println();
        }

    }
}