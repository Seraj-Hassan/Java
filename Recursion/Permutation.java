public class Permutation {
    public static void printPrem(String str, String permu){

        if(str.length()==0){
            System.out.println(permu);
            return;
        }
        for(int i=0;i<str.length();i++){
           char currChar=str.charAt(i);

           String newStr = str.substring(0, i) + str.substring(i+1);
           printPrem(newStr, permu+currChar);
        }
    }

    public  static void main(String[] args){
        String str ="abc";
        printPrem(str, "");
    }
    
}
