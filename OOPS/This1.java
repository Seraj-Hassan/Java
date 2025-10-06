class Data{
    int a=10,b=20,c=30;
    void showData(){
        int a=50,b=60;
        System.out.println("a= "+a);
        System.out.println("b= "+b);
        System.out.println("c= "+c);
    }
}

public class This1 {
    public static void main(String[] args) {
        new Data().showData();
        
    }

    
}
