

public class table1to10{
    public static void main(String[] args){
       
        int n = 5; // table size

        // Outer loop for rows
        for (int i = 1; i <= n; i++) {
            // Inner loop for columns
            for (int j = 1; j <= n; j++) {
                System.out.print((i * j) + "\t"); // \t adds a tab space for alignment
            }
            System.out.println(); // move to next row
        }

    }
}