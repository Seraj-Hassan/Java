public class Exception3 {
    public static void main(String[] args){
        int a,b,c;
        a=10;
        b=0;
        try{
        c=a+b;
        System.out.println("Addtion: "+c);
        c=a-b;
        System.out.println("Subtraction: "+c);
        c=a/b;
        System.out.println("Divied: "+c);
        }
       catch(ArithmeticException ae){
        System.out.println("--------------------");
        System.out.println("Method1 It can not be ");
        System.out.println("Method2: "+ae.getMessage());
        System.out.println("Method3: "+ae);
        System.out.println("Method4");
        ae.printStackTrace();
        System.out.println("-----------------------");
       }
        c=a*b;
        System.out.println("Multiplication: "+c);
                                   
        System.out.println("End of program");

    }
    
}




