public class Implimentation {

    // Node class represents each element (node) of the linked list
    public static class Node {
        int data;   // stores the value
        Node next;  // reference to the next node

        // constructor to initialize node with data
        Node(int data) {
            this.data = data;
            this.next = null; // next is null when node is created
        }
    }

    // Linkedlist class manages the nodes (head and tail)
    public static class Linkedlist { 
        Node head = null; // first node of list
        Node tail = null; // last node of list

        // Insert a node at the end of the list
        void insertAtEnd(int val) {
            Node temp = new Node(val); // create a new node
            if (head == null) {        // if list is empty
                head = temp;           // head points to new node
                tail = temp;           // tail also points to same node
            } else {
                tail.next = temp;      // link current tail to new node
                tail = temp;           // move tail to new node
            }
        }

        // Display all nodes of the linked list
        void display() {
            Node temp = head;          // start from head
            while (temp != null) {     // loop until end of list
                System.out.print(temp.data + " "); // print data
                temp = temp.next;      // move to next node
            }
        }
    }

    // Main method to test LinkedList
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist(); // create linked list object

        // Insert some elements
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.insertAtEnd(10);
        ll.insertAtEnd(20);

        // Display the linked list
        ll.display();  // Output: 4 5 10 20
    }
}
