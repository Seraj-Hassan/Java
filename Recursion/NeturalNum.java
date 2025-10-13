public class NeturalNum {
    public static void SumofAllNum(int i, int n, int sum){
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        SumofAllNum(i+1, n, sum);
        System.out.println(i);

    }
    public static void main(String[] args){
        SumofAllNum(1, 5, 0);

    }
}
