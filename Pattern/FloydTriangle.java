public class FloydTriangle{
    public static void main(String[] arge){
        int n=5;
        int Number=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(Number+" ");
                Number++;
            }
           
            System.out.println();
        }

    }
}