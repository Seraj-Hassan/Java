/*wap to find largest between 2 and 3 Number using method overloading */

package Polymosphism;


class FindNumber{

   void number(int a,int b,int c){
    if(a>b){
        System.out.println(a);
    }
    else if(a>c){
        System.out.println(a);
    }
    
   }
   void number(int b,int c){
    if(c>b){
        System.out.println(c);
    }
    else{
        System.out.println(b);
    }
   }
   
  
}


class Findlargest{
    public static void main(String[] args) {
        FindNumber F=new FindNumber();
        F.number(6,3,4);
        F.number(3, 4);

    }

}