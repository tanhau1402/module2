package bst_preorder;

public class Main {
    public static void main(String[] args) {
        Preorder tree = new Preorder();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.printPreorder(tree.root);

    }
}
