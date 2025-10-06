public class foreach {
    public static void main(String[] args) {
        int arr[]={2,5,6,-3,-4,-6};
        int pos=0,neg=0;
        for( int value:arr){
            System.out.println(value);
            if(0<value){
                pos=pos+value;
            }
            else{
                neg=neg+value;
            }

        }
        System.out.println("Sum of positive value: "+pos);
        System.out.println("sum of negative value: "+neg);

    }
}
