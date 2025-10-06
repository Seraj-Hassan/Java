/*WAP to input Book Name, Page Number, Cost and Selling Price and Print Book Name, Page
Number with profit or Loss using Class Object*/
import java.util.*;
class ProfitLoss{
    String bookName;
    double cp,sp;
    int n;
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter book name: ");
        bookName=sc.next();
        System.out.print("Enter your Page numbr: ");
        n=sc.nextInt();
        System.out.print("Enter cost Prize: ");
        cp=sc.nextDouble();
        System.out.print("Enter selling prize: ");
        sp=sc.nextDouble();


    }
    void findProfitorLoss(){
        System.out.println("Book name: "+bookName);
        System.out.println("Page number: "+n);
        if(sp>cp){
            System.out.println("Profit");
        }
        else{
            System.out.println("Loss");
        }

    }
}


public class ProfitorLoss {
    public static void main(String[] args) {
        ProfitLoss obj=new ProfitLoss();
        obj.input();
        obj.findProfitorLoss();
        ProfitLoss obj1=new ProfitLoss();
        obj1.input();
        obj1.findProfitorLoss();
        ProfitLoss obj2=new ProfitLoss();
        obj2.input();
        obj2.findProfitorLoss();
    }
    
}
