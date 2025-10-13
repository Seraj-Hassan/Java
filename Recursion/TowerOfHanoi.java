public class TowerOfHanoi {
    public static void ofHanoi(int n, String source, String helper, String dest) {
       
        if (n == 1) {
            System.out.println("Transfer disk " + n + " from " + source + " to " + dest);
            return; 
        }

       
        ofHanoi(n - 1, source, dest, helper);

       
        System.out.println("Transfer disk " + n + " from " + source + " to " + dest);

       
        ofHanoi(n - 1, helper, source, dest);
    }

    public static void main(String[] args) {
        ofHanoi(3, "S", "H", "D");  
    }
}
