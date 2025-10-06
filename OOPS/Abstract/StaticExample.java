package Abstract;
class Employee{
    int code;
    String name;
    static int count; // static variable 
    void getEmp(int code,String name){
        this.code=code;
        this.name=name;
        count++;
    }
    void putEmp(){
        System.out.println("------------------");
        System.out.println("Employee Code\t"+code);
        System.out.println("Employee name\t"+name);
    }
    static void showcount(){  // static method
        System.out.println("total number Employee= "+count);

    }
}

public class StaticExample {
    public static void main(String[] args){
        Employee E1=new Employee();
        Employee E2=new Employee();
        Employee E3=new Employee();
        E1.getEmp(1, "Seraj");
        E2.getEmp(2, "Hassan");
        E3.getEmp(3, "Ansari");
        E1.putEmp();
        E2.putEmp();
        E3.putEmp();
        Employee.showcount(); // static method call without object
        E2.showcount();
    } 
}
