package bst_postorder;

public class BinarySearchTree {
    Node root;
    BinarySearchTree(){
        root = null;
    }
    void printPostorder(Node node) {
        if (node == null) {
            return;
        }
        printPostorder(node.left);
        printPostorder(node.right);
        System.out.println(node.key + " ");
    }
}
