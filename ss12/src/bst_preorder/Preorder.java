package bst_preorder;

public class Preorder {
    Node root;
    Preorder() {
        root = null;
    }
    void printPreorder(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.key + " ");
        printPreorder(node.left);
        printPreorder(node.right);

    }
}
