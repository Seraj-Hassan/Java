
import java.util.Scanner;

public class SQueue {
    int MAX = 10;
    int que[]=new int[MAX];
    int front,rear;
    static Scanner scan;

    public SQueue() {
        scan=new Scanner(System.in);
        front=rear=-1;

    }
    void insert(){
        if(rear==MAX-1){
            System.out.println("Overflow");
        }
        else if(front==-1 && rear==-1){
            front=rear=0;
            System.out.println("Enter the first Element");
            que[rear]=scan.nextInt();
        }
        else{
            System.out.println("Enter the elelemt to be insert");
            que[++rear]=scan.nextInt();
        }
    }
    void delete(){
        if(front==-1 && rear==-1){
            System.out.println("UnderFlow");
        }
        else if(front==rear){
            System.out.println(que[front]+" is delete");
            front=rear=-1;
        }
        else{
            System.out.println(que[front]+" is delete");
            front++;
        }
    }
    void search(){
        int n,s=0;
        if(front==-1 && rear==-1){
            System.out.println("Underflow");
        }
        else{
            System.out.println("Enter the element to be search");
            n=scan.nextInt();
            for(int i=front;i<=rear;i++){
                if(n==que[i]){
                    System.out.println("Element is found");
                    s++;
                    break;
                }

            }
            if(s==0)
            System.out.println("Element is not found");
        } 
    }
    void display(){
        if(front==-1 && rear==-1){
            System.out.println("Underflow");

        }
        else{
            System.out.println("_________list of element__________");
            for(int i=front;i<=rear;i++){
                System.out.println(que[i]);

            }
        }
    }
    public static void main(String[] args) {
        SQueue SQ=new SQueue();
        int ch;
        while(true){
        System.out.println("1. Insert\n2. Delete\n3. Serach\n4. Display\n5. Exit");
        System.out.println("Enter your choice 1 to 5");
        ch=scan.nextInt();
        switch(ch){
            case 1:
            SQ.insert();
            break;
            case 2:
            SQ.delete();
            break;
            case 3:
            SQ.search();
            break;
            case 4:
            SQ.display();
            break;
            case 5:
            System.exit(0);
            break;
            default:
            System.out.println("worng Choice, try again");
        }
        
        }

    }
    
}
