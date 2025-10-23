public class SubSequences {
    public static void  SubSequencesofString(String str, int idx, String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar =str.charAt(idx);

        // to be
        SubSequencesofString(str, idx+1, newString+currChar);

        // or not to be

        SubSequencesofString(str, idx+1,newString);

    }
    public static void main(String[] args){
        SubSequencesofString("abc",0,"");

    }
}
