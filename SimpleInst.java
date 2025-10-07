public class SimpleInst {
    public static void main(String[] args) {
        int p;
        double r,t,si;
        p=Integer.parseInt(args[0]);
        r=Double.parseDouble(args[1]);
        t=Double.parseDouble(args[2]);
        si=p*r*t/100;
        System.out.println("Simple Interst Number = "+si);
    }
}
