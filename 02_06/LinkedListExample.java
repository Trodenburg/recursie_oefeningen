package linkedlistexample;

public class LinkedListExample {

    static Node head;

    public static void main(String[] args) {
        Node node1 = new Node("Opel Karl", null);
        Node node2 = new Node("Tesla Model 3", null);
        Node node3 = new Node("Jaguar I-Pace", null);
        node1.next = node2;
        node2.next = node3;
        node3.next = null;
        printList(node1);
       
    }
    private static void printList(Node n)
    {
        if(n != null)
        {
            printList(n.next);
            System.out.println(n.value + " ");
        }
    }
   
}


