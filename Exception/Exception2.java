// prgram to understand try with finally

public class Exception2 {
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
        finally
        {
        c=a*b;
        System.out.println("Multiplication: "+c);
        }                             
        System.out.println("End of program");

    }
    
}


