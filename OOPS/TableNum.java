import java.util.Scanner;

class Table{
    int n,t;
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        n=sc.nextInt();

    }
    void result(){
        for(int i=1;i<=10;i++){
            t=n*i;
            System.out.println(t);
        }
    }
}

public class TableNum {
    public static void main(String[] args) {
        Table num=new Table();
        num.input();
        num.result();
    }
    
}
