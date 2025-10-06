

public class basicll {
    public static void display(Node head){
        if(head==null) return;
        System.out.print(head.data+" ");
        display(head.next);
    }
    public static void displayr(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head = head.next;
        }

    }



    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args){
        Node a=new Node(5);
        Node b=new Node(6);
        Node c=new Node(7);
        Node d=new Node(3);
        Node e=new Node(9);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        // Node temp=a;
        // while(temp!=null){
        //     System.out.print(temp.data+" ");
        //     temp=temp.next;
        // }

        display(a);
        System.out.println();
        displayr(a);
    }
}
