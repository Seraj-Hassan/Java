class Company{

    Company(){
        System.out.println("Default Constructor of class Company");


    }
}
class Employee extends Company{

    Employee(){
        System.out.println("Default Constructor of classEmployee");
    }
    Employee(int x){
        System.out.println("Parametrized Constructor  class Employee");
    }
}


public class ConstructorInheritance {
    public static void main(String[] args){
        Employee E=new Employee();
        Employee E2=new Employee(10);
        

    }
}
