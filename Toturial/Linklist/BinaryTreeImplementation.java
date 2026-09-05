import java.util.LinkedList;
import java.util.Queue;

class Node{
    int val;
    Node left;
    Node right;

    Node(int val){
        this.val = val;
    }
}

class Pair{
    int level;
    Node node;

    Pair(Node node, int level){
        this.node = node;
        this.level = level;
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
        //c.right = g;

        // display(a);
        // System.out.println();
        // System.out.println(size(a));
        //System.out.println(sum(a));
        // System.out.println(pro(a));
        // System.out.println(max(a));
        // System.out.println(min(a));
        //levelOrder(a);
        //System.out.println(lavels(a));
        levelOrderLineWiseWithoutPair(a);

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
        if (root.left==null && root.right ==null) {
            return 1;
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
        // suppose that right se mila 2 and left se 1 to max value mein 1 + karake print karega aur vahi levle hoga
        return 1 + Math.max(lavels(root.left),lavels(root.right));
    }


    static void levelOrder(Node root){

        Queue<Node> q = new LinkedList<>();

        q.add(root);

        while (q.size()>0) {
            Node front = q.remove(); // jo value remove hui usko return karega and vah node front usse store kar lega.
            System.out.print(front.val+"  "); // yaha front value print  ho jayegi
           if(front.left!=null)q.add(front.left);// agar front ke left node mei koi data hai to vo add ho jye queue mein (kyonki front mei jo node hai vah root tha and root left right dono se attached hai )
            if(front.right!= null)q.add(front.right);// agar koi right mein hai to add ho jaye
        }
        System.out.println();
    }

    private static void levelOrderLineWiseWithoutPair(Node root) {
    if (root == null) return;
    
    Queue<Node> q = new LinkedList<>();
    q.add(root);

    while (!q.isEmpty()) { // agar q empty nhi hai to 
        int count = q.size(); // Current level par kitne nodes hain
        for (int i = 0; i < count; i++) {
            Node front = q.remove();
            System.out.print(front.val + " ");
            if (front.left != null) q.add(front.left);
            if (front.right != null) q.add(front.right);
        }
        System.out.println(); // Ek pura level print hone ke baad new line
    }
}

 
}