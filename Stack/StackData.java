
import java.util.Scanner;
 class StackData {
    int MAX=10,top=-1;
    int st[];
    static Scanner scan;

    StackData() {
        st=new int[MAX];
        scan=new Scanner(System.in); 
    }
    void push(){
        if(top==MAX-1){
            System.out.println("Overeflow: we can not insert");
        }
        else{
            top++;
            System.out.println("Enter the element to be push");
            st[top]=scan.nextInt();
        }
    }
    void pop(){
        if(top==-1){
            System.out.println("underflow");
        }
        else{
            System.out.println(st[top]+" is pop");
            top--;
        }
    }
    void search(){
        int n,s=0,i;
        if(top==-1){
            System.out.println("underflow");
        }
        else{
            System.out.println("Enter the elemet to be search");
            n=scan.nextInt();
            for(i=top;i>=0;i--){
                if(st[i]==n){
                    System.out.println("element is found");
                    s++;
                    break;
                }
            }
            if(s==0){
                System.out.println("element is not found");
            }
        }
    }
    void traverse(){
        if(top==-1){
            System.out.println("unserflow");
        }
        else{
            System.out.println("________Traversing_________");
            for(int i=top;i>=0;i--){
                System.out.println(st[i]);
            }
        }
    }
    public static void main(String[] args){
        int ch;
        StackData stack=new StackData();
        while(true){
            System.out.println("1. Push\n2. Pop\n3. Search\n4. Traverse\n5. Exit");
            System.out.println("Enter the choice(1 to 5)");
            ch=scan.nextInt();
            switch(ch){
                case 1:
                stack.push();
                break;
                case 2:
                stack.pop();
                break;
                case 3:
                stack.search();
                break;
                case 4:
                stack.traverse();
                break;
                case 5:
                System.exit(0);
                default:
                System.out.println("worng Choice");
            }
        }
    }
    
}
