class Shap{
    int w,h,d;
    double area;
    Shap(){  
        w=10;
        h=20;
        d=30;
    }
    Shap(int x,int y,int z){
        w=x;
        h=y;
        d=z;
       
        
    }
    Shap(Shap s){
        w=s.w;
        h=s.h;
        d=s.d;
    }
    void ShapArea(){
        area=2*(w*h+h*d+d*w);
        System.out.println("Area of shap= "+area);

    }
}


public class AreaShap {
    public static void main(String[] args) {
        Shap D=new Shap();
        Shap D1=new Shap(9,7,8);
        Shap D2=new Shap(D1);
        D.ShapArea();
        D1.ShapArea();
        D2.ShapArea();
        
    }
    
}
