public class APNA_BinaryTreeYT {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinarTree{
        static int idx  = -1;
        public static Node buildTree(int nodes[]){
            idx ++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNOde = new Node(nodes[idx]);
            newNOde.left =  buildTree(nodes);
            newNOde.right = buildTree(nodes);

            return newNOde;
        }
    }
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinarTree tree = new BinarTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
    }
}
