package challenges;

public class SortedLinkedList {

    Node head;

    SortedLinkedList() {
        this.head = null;
    }

    void insert(int value) {
        Node newNode = new Node(value);

        if (head == null || head.value >= value) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null && current.next.value < value) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
