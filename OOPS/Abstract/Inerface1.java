

interface Company{
    String cname="Analyze Infotech";
    int pin = 274505;
    void showData();
    void msg();
}
class Employee implements Company{
    int ecode;
    String ename;
    void getEmp(int code,String name){
        ecode=code;
        ename=name;
    }
    public void showData(){ // override
        System.out.println("Company Name\t"+cname);
        System.out.println("Pin Code\t"+pin);
        System.out.println("Employee Name\t"+ename);
        System.out.println("Employee Code\t"+ecode);
    }
    public void msg(){// override
    }
}

public class Inerface1 {
    public static void main(String[] args) {
        Employee emp=new Employee();
        emp.getEmp(23,"Seraj");
        emp.showData();

    }
}
