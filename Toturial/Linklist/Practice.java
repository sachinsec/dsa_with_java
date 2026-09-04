import java.util.LinkedList;
import java.util.Queue;

/**
 * Practice
 */
class Node{
    Node left;
    Node right;
    Node root;
    int value;
    public Node(int value){
        this.value = value;
    }
}
class binary{

    public void dis(Node root){
        if (root == null) {
            return;
        }

        System.out.println(root.value);
        dis(root.left);
        dis(root.right);
    }

    public int size(Node root){
        if (root == null) {
            return 0;
        }
        if (root.left==null && root.right==null) {
            return 1;
        }
        int left = size(root.left);
        int right = size(root.right);

        return 1+ left + right;

    }
    public int sum(Node root){
        if (root == null) {
            return 0;
        }

        return root.value+sum(root.left)+sum(root.right);
    }

    public int pro(Node root){
        if (root == null) {
            return 1;
        }

        return root.value*pro(root.left)*pro(root.right);
    }

    public int max(Node root){
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        return Math.max(root.value,Math.max(max(root.left),max(root.right)));
    }

     public int min(Node root){
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        return Math.min(root.value,Math.min(min(root.left),min(root.right)));
    }
    public void lavelorder(Node root){
    
        if (root==null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (q.size() > 0) {
            Node front = q.remove();
            System.out.print(front.value + " ");
            if (front.left!=null) {
                q.add(front.left);
            }if (front.right!=null) {
                q.add(front.right);
            }
        }
        System.out.println();

    }

    public void linewiseorder(Node root){
         if (root==null) {
            return;
         }
         Queue<Node> q = new LinkedList<>();
         q.add(root);

         while (!q.isEmpty()) {
            int count = q.size();

            for (int i = 0; i < count; i++) {
                Node front = q.remove();
                System.out.print(front.value+" ");
                if (front.left!=null) {
                    q.add(front.left);
                }
                if (front.right!=null) {
                    q.add(front.right);
                }
            }
            System.out.println();
         }
    }

}
public class Practice {

    public static void main(String[] args) {
        
        Node a = new Node(5);
        Node b = new Node(1);
        Node c = new Node(15);
        Node d = new Node(11);
        Node e = new Node(19);
        Node f = new Node(78);
        Node g = new Node(31);

        a.left=b;
        a.right=c;

        b.left =d;
        b.right = e;

        c.left =f;
        c.right =g;
        
        binary bi = new binary();

        // System.out.println(bi.size(a));
        bi.lavelorder(a);
        System.out.println();
        bi.linewiseorder(a);

    }
}