 class Largest {
    public static void main(String[] args) {
        int a,b,c;
        a=3;
        b=999999;
        c=5;
        if(a>b && a>c)
        {
            System.out.println("Largest Number=" +a);
        }
        else if(b>c)
        {
            System.out.println("Largest Number=" +b);
        }
        else{
            System.out.println("Largest Number=" +c);
        }

    }
}
