public class Number {
    int a;// instance variable
    float b;
    boolean c;
    void output()
    {
        //int d; // Locale variable
        System.out.println("a= "+a);
        System.out.println("b= "+b);
        System.out.println("C= "+c);
        // System.out.println("d= "+d);  
    }
    public static void main(String[] args) {
        Number obj=new Number();
        obj.output();
    }
}