class Circle{
    double r,ar,cr;// these are intance Variable
    void input(double x){
        r=x;
    }
    void area(){
        ar=Math.PI*r*r;
        System.out.println("Area of ciicle"+ar);
    }
    void circum(){
        cr=2*Math.PI*r;
        System.out.println("Circumference= "+cr);
    }
}

public class Runcircle {
    public static void main(String[] args) {
        Circle s1=new Circle();
        s1.input(7.5);
        s1.area();
        s1.circum();
        
    }
    
}
