
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
        System.out.println("Size of binary tree: "+size(b));
        System.out.println("Sum of the binary tree: "+sum(a));
        System.out.println("Product of the binary tree: "+product(a));
                
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

    static int sum(Node root){
        if(root==null)return 0;
        return root.value + sum(root.left)+sum(root.right);
    }

    static int product(Node root){
        if (root == null) {
            return 1;
        }

        return root.value * product(root.left) * product(root.right);
    }
}
