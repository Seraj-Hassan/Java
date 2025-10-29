// Ques => Palce Yiles of size 1xm in a flor of size nxm

public class PlaceTiles {
    public static int placeTileses(int n, int m){
        if( n==m){
            return 2;

        }
        if(n < m){
            return 1;
        }
        int varticalPalce = placeTileses(n-m, m);
        int horPlace =placeTileses(n-1, m);
        return varticalPalce + horPlace;
    }
    public static void main(String[] args) {
        int n =4 , m=2;
        System.out.println(placeTileses(n, m));
        
    }
    
}
