class Node{
    int val;
    Node next;
    public Node(int val){
        this.val = val;

    }    
}
public class LLGeek2 {
    static void display(Node head){
      Node temp = head;
      System.out.println(temp.val);
    }

    //Using recursion print
    public static void disrec(Node head){
        if (head == null) {
            return;
        }
       // System.out.println(head.val); // simple print
        disrec(head.next);
        System.out.println(head.val); // reverse print
    }
    public static void main(String[] args) {
        
        Node a = new Node(106);
        Node b = new Node(130);
        Node c = new Node(104);
        Node d = new Node(150);

        a.next = b;
        b.next = c;
        c.next = d;

        // disrec(a);
       // System.out.println(get(a,2)); // For get specific index 

        //System.out.println(a);
    }

    private static int get(Node a,int i){
        Node temp = a;
        for (int j = 0; j < i; j++) {
              temp=temp.next;
        }
        return temp.val;
    }
}
