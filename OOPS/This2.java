class Data{
    int a=10,b=20,c=30;
    void showData(){
        int a=50,b=60;
        System.out.println("a= "+a);
        System.out.println("b= "+b);
        System.out.println("c= "+c);
        System.out.println("a= "+this.a);
        System.out.println("b= "+this.b);

    }
}

public class This2 {
    public static void main(String[] args) {
        new Data().showData();
    }

    
}

