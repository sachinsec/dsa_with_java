class Node{
    int val;
    Node next; // It's default value is Null

    public Node(int val){
         this.val = val;
    }
}

public class LLGeek {

    private static void display(Node head){
         Node temp = head;
        while (temp != null) {
            System.out.println(temp.val);
           temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Node a= new Node(10); // head node
        Node b= new Node(20);
        Node c= new Node(30);
        Node d= new Node(40);
        Node e= new Node(50);

       // System.out.println(a.next); // Without connecting

        // Connect Karenge (Link Karenge)
        a.next =b;
        b.next =c;
        c.next =d;
        d.next =e;

        display(a);
    }
    
}