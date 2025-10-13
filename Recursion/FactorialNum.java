public class FactorialNum {
     public static void Factorial(int i,int Fact){
        if(i==0){
            System.out.println(Fact);
            return;
        }
        Fact*=i;
        Factorial(i-1, Fact);
        
        
     }
    public static void main(String[] args) {
        Factorial(5, 1);
        
        
    }
    
}
