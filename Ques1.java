//Wap to Input radius of circle and compute area circumference

import java.util.*;
class Ques1 {
    public static void main(String[] args) {
        float r, ar,cr;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Radius");
        r=sc.nextFloat();
        ar=3.14f*r*r;
        cr=2*3.14f*r;
        System.out.println("area of circla= "+ar);
        System.out.println("Cir = "+cr);


    }
}
