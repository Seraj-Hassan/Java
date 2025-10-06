class Company{

    Company(int x){
        System.out.println("Parametrize Constructor");
    }
}
class Employee extends Company{
    Employee(){
        super(10);
        System.out.println("Default COntructoe claa Employee");
    }
}
public class ConstructorInheritance1 {
    public static void main(String[] args){
        Employee E=new Employee();
    }
}