package Abstract;

class Number{
    static int squre(int n){
        return n*n;
    }
    static int cube(int n){
        return n*n*n;
    }
}
public class StaticMethod1 {
    public static void main(String[] args) {
        System.out.println("Squre= "+Number.squre(2));
        System.out.println("cub= "+Number.cube(2));   
    }
}
