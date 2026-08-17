class Node {
    int data;
    Node next;

    // Constructor to create a new node
    public Node(int data) {
        this.data = data;
        this.next = null; // Point to nothing by default
    }
}

class LinkedList {
    Node head; // Points to the first node in the list

    // Add a new node to the end of the list
    public void append(int data) {
        Node newNode = new Node(data);
        // Case 1: If list is empty, make the new node the head
        if (head == null) {
            head = newNode;
            return;
        }

        // Case 2: Walk to the last node
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        // Point the last node's 'next' to the new node
        current.next = newNode;
    }

    // Print the entire list visually
    public void display() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Main method to test the code
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();

        myList.append(10);
        myList.append(20);
        myList.append(30);

       // myList.display();
        // Output: 10 -> 20 -> 30 -> null
    }
}