
class Node{
    int value; 
    Node right;
    Node left;
    Node root;

    public Node(int value){
        this.value = value;
    }
}
public class Practice {
    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(2);
        Node c = new Node(4);
        Node d = new Node(1);
        Node e = new Node(5);
        Node f = new Node(4);

        a.left = b;a.right=c;
        b.left = d; b.right=e;
        c.left = f;
        
        //display(a);
        System.out.println(size(b));
                
    }

    static void display(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.value+" ");
        display(root.left);
        display(root.right);
    }

    static int size(Node root){
        if(root == null) return 0;
        int rootleft = size(root.left);
        int rootright = size(root.right);

        return 1 + rootleft + rootright;
    }
}
