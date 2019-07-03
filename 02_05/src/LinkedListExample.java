public class LinkedListExample {

    static Node head;

    public static void main(String[] args) {
        
        Node node1 = new Node(1, null);
        Node node2 = new Node(2, null);
        Node node3 = new Node(3, null);

        node1.next = node2;
        node2.next = node3;
        node3.next = null;

        reversePrint(node1);
    }

    public static void reversePrint(Node n) {
        if (n != null) {
            reversePrint(n.next);
            System.out.print(n.value + " ");
        }
    }
}


