public class FindOccurence {
    public static int first= -1;
    public static int last= -1;
    public static void printOccurence(String str,int idx,char element){
        if(idx == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar ==  element){
            if(first == -1){
                first = idx;
            }
            else{
                last = idx;
            }
    
        }
        printOccurence(str, idx+1, element);

    }
    public static void main(String[] args) {
        printOccurence("bacjhbhah", 0,'a');
        
    }
}
