class Triangle{
    int a,b,c;
    double s,ar;
    Triangle(){       // Explicit Default Constructor
        a=8;
        b=9;
        c=7;
        System.out.println("This is class triangle");
    }
    void area(){
        s=(a+b+c)/2.0;
        ar=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of triangle: "+ar);

    }
}


public class AreaTriangle {
    public static void main(String[] args){
        Triangle obj=new Triangle();
        obj.area();
    }
}
