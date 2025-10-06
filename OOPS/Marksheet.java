
import java.util.Scanner;

// Wap to create a class Stydent , input student Name and marks of 3 subject and generate the 
//marksheet with total
class Student {
    String sname;
    int m1,m2,m3,total;
    float per;
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Student name mark of 3 Subject: ");
        sname=sc.next();
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();
    
    }
    void result(){
        System.out.print("----------------------------------");
        total=m1+m2+m3;
        per=total/3.0f;
        System.out.println("Student Name\t"+sname);
        System.out.println("Total Marks\t"+total);
        System.out.println("Percentage\t"+per);
        if(per>60){
            System.out.println("First Division");
        }
        else if(per>=45){
          System.out.println("Second Deviesion");
        }
        else if(per>=33){
            System.out.println("third Division");
        }
        else{
           System.out.println("Fail");
        }
    }
}

public class Marksheet {
    public static void main(String[] args) {
        Student stu1=new Student();
        Student stu2=new Student();
        Student stu3=new Student();
        stu1.input();
        stu1.result();
        stu2.input();
        stu2.result();
        stu3.input();
        stu3.result();
    }
    
}
