public class CalPower {
    public static int Power(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int pow = Power(x, n-1);
        int pow1=x*pow;
        return pow1;

    }
    public static void main(String[] args) {
        int x=2;
        int n=5;
        int ans=Power(x, n);
        System.out.println(ans);
        
    }
}
