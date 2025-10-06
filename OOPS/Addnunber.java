import java.util.Scanner;

class Number{
    int a,b,c; // Intance variable
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 Number");
        a=sc.nextInt();
        b=sc.nextInt();

    }
    void add(){
        c=a+b;
        System.out.println("Addation: "+c);
    }
    void multi(){
        c=a*b;
        System.out.println("Multiplay: "+c);
    }
}



public class Addnunber{
    public static void main(String[] args) {
        Number obj=new Number();
        obj.input();
        obj.add();
        obj.multi();
        
    }
}