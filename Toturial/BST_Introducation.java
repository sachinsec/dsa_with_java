import java.util.Scanner;

/**
 * BST_Introducation
 */


/*

Where is it used?
1. file system
2. Databases
3. Algorithms/ networking
4. Math problems
5. DTS -> ML
6. Comprasion of files.
7. Future Data Structures.

Rules of it 
      (15)
     /   \
   (35)  (40)
   /\     /\
 (3)(6) (5)(7)

 In the left smaller and in the right is bigger


*/

class BinaryTree{

    public BinaryTree(){

    }

    private static class Node{
        int value;
        Node left;
        Node right;
        public Node(int value){
            this.value = value;
        }
    }

    private Node root;

    // insert elements
    public void populate(Scanner scanner){
        root = new Node(scanner.nextInt());
        System.out.println("Enter the root Node:");
        int value= scanner.nextInt();
        root = new Node(value);
        populate(scanner,root);

    }

    private void populate(Scanner scanner, Node node){
        System.out.println("Do you want to enter left of " + node.value);
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.println("Enter the value of the left of " + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner,node.left);
        }
    }
}

public class BST_Introducation {

    public static void main(String[] args) {
        
    }
    
}