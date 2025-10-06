public class D {
    public static void main(String[] agrs){
        int n=5;
        int m=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=5;j++){
                if
                (j == 1 ||                    // left vertical line
                    (i == 1 && j < m) ||         // top horizontal line
                    (i == n && j < m) ||         // bottom horizontal line
                    (j == m && i != 1 && i != n))// right vertical line (excluding corners
                    {
                        System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
}
