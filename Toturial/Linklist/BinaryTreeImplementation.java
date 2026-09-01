
class Node{
    int val;
    Node left;
    Node right;

    Node(int val){
        this.val = val;
    }
}

public class BinaryTreeImplementation {
    public static void main(String[] args) {

       /*
                 3
               /   \
            4         2
          /   \     /   \
        -1     1   6     9
       */
        
        Node a  = new Node(3); // root
        Node b  = new Node(4);
        Node c  = new Node(2);
        Node d  = new Node(-1);
        Node e  = new Node(1);
        Node f  = new Node(6);
        Node g  = new Node(9);


        a.left = b;
        a.right = c; 
        
        b.left = d;
        b.right = e;

        c.left = f; 
        c.right = g;

        // display(a);
        // System.out.println();
        // System.out.println(size(a));
        //System.out.println(sum(a));
        // System.out.println(pro(a));
        // System.out.println(max(a));
        // System.out.println(min(a));

    }

    private static void display(Node root){
        if (root ==null) {
            return;
        }
        System.out.print(root.val+" ");
        display(root.left);  // It is print all left side values
        display(root.right); // It is print all right side values
    }

    private static int size(Node root){
        if (root == null) {
            return 0;            
        }
        int leftsize = size(root.left);
        int rightsize = size(root.right);

        return 1 + leftsize + rightsize; 

        // For the more looks good we use turnery
        // return (root == null) ? 0: 1+ size(root.left) + size(root.right);
    }
    
    static int sum(Node root){
        if (root == null) {
            return 0;
        }
        return root.val + sum(root.left) + sum(root.right);
    }

    static int pro(Node root){
        if (root == null) {
            return 1;
        }
        return root.val * pro(root.left) * pro(root.right);
    }

    static int max(Node root){
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        return Math.max(root.val,Math.max(max(root.left),max(root.right)));
    }

    static int min(Node root){
        if (root==null) {
            return Integer.MAX_VALUE;
        }
        return Math.min(root.val,Math.min(min(root.left),min(root.right)));
    }


    static int lavels(Node root){
        if (root==null) {
            return 0;
        }
        return 1 + Math.max(lavels(root.left),lavels(root.right));
    }

}