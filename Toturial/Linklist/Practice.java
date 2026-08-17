/**
 * Practice
 */
class Node{
    int val;
    Node next;
    public Node(int val){
        this.val = val;
    }
}
public class Practice {

    static void display(Node head){
        for (Node temp = head ; temp != null; temp=temp.next) {
            System.out.print(temp.val+" ");
        }
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(108);
        Node c = new Node(103);
        Node d = new Node(150);
        Node e = new Node(80);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        display(a);
    }
}