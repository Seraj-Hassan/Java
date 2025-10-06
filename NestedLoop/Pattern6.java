public class Pattern6 {

    public static void main(String[] args){
        for(int i=1;i<=9;i++){
            for(int j=0;j<=9-i;j++){
                System.out.print(" ");

            }
            for(int j=1;j<=i;j++){
               
                   if(i%2!=0){
                    System.out.print("* ");
                   }
                
                
            }
            System.out.println();
        }
    }
}
