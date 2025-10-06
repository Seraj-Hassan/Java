
abstract class Company{
    String cname;
    void getcmp(String cname){
        this.cname=cname;
    }
    abstract  void showInfo();   
}
class Employee extends Company{
    String ename;
    void getEmp(String ename){
        this.ename=ename;

    }
    void showInfo(){ // override
        System.out.println("Company Name\t"+cname);
        System.out.println("Employee Name\t"+ename);

    }
}
public class TestAbstract {
    public static void main(String[] args){
      //  Company C=new Company() // Error
        Employee E=new Employee();
        E.getcmp("Anaylze");
        E.getEmp("Seraj");
        E.showInfo();

    }  
}
