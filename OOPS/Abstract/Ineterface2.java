
interface Company{
    String cname="Analyze Infotech";
    int pin=628922;
    void showdata();
    void msg();
}
class Department{
    String dname;
    int dcode;
    void getDept(String dname,int dcode){
        this.dname=dname;
        this.dcode=dcode;
    }
}
class Employee extends Department implements Company{
    int code;
    String name;
    void getEmp(int code,String name){
        this.code=code;
        this.name=name;

    }
    public void showdata(){
        System.out.println("Company name\t"+cname);
        System.out.println("Pin code\t"+pin);
        System.out.println("Department name\t"+dname);
        System.out.println("Department number\t"+dcode);
        System.out.println("Employee name\t"+name);
        System.out.println("Employee code\t"+code);
    }
    public void msg(){

    }
}
public class Ineterface2 {
    public static void main(String[] args){
        Employee E=new Employee();
        E.getDept("Seraj",34);
        E.getEmp(10, "Seraj");
        E.showdata();


    }
    
}
