class Circle{
    double r,ar;
    Circle(double x){ // parametrized
        r=x;
    }
    void area(){
        ar=Math.PI*r*r;
        System.out.println("Area of Circle: "+ar);
    }
}


public class ParaCircle {
    public static void main(String[] args) {
        Circle obj=new Circle(8.3);  // parameterize constructor;
        obj.area();
    }
}
