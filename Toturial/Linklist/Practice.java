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

public class Practice {
public static void main(String[] args) {
    Node a = new Node(1);
    Node b = new Node(2);
    Node c = new Node(3);
    Node d = new Node(9);
    Node e = new Node(5);
    Node f = new Node(6);
    Node g = new Node(7);

    a.left =b;
    a.right =c;

    b.left = d;
    b.right = e;

    c.left = f;
    c.right = g;
    // display(a);

    // System.out.println(sum(a));
    // System.out.println(product(a));
    System.out.println(max(a));
    System.out.println(mins(a));

    }     
 static void display(Node root){
      if (root == null) {
        return;
      }
      System.out.print(root.value+" ");
      display(root.left);
      display(root.right);
    }

    static int sum (Node root){
        if (root == null) {
            return 0;
        }

        return root.value + sum(root.left)+sum(root.right);
    }

    static int product(Node root){
        if(root == null){
            return 1;
        }
        return root.value*product(root.left)*product(root.right);
    }

    static int max(Node root){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        return Math.max(root.value, Math.max(max(root.left),max(root.right)));
    }

    static int mins(Node root){
        if(root == null){
            return Integer.MAX_VALUE;
        }
        return Math.min(root.value, Math.min(mins(root.left),mins(root.right)));
    }
}