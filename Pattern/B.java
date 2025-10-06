public class B {
    public static void main(String[] args) {
        int n=7;
        int m=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(j==1 || (i==1 && j<m) || (i==n && j<m) || (i==n/2+1 && j<m) || (j == m && i != 1 && i != n && i != n / 2 + 1)){
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
