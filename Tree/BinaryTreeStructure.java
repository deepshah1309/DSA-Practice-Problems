public class BinaryTreeStructure {
    Tree root;

    BinaryTreeStructure(int key) {
        root = new Tree(key);
    }

    BinaryTreeStructure() {
        root = null;
    }

    public void inorder(Tree root) {
        if (root != null) {
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }

    }

    public static void main(String... args) {
        BinaryTreeStructure tree = new BinaryTreeStructure();

        tree.root = new Tree(1);

        /*
         * following is the tree after above statement
         * 
         * 1 / \ null null
         */

        tree.root.left = new Tree(2);
        tree.root.right = new Tree(3);
        tree.inorder(tree.root);
    }
}

class Tree {
    Tree left;
    Tree right;
    int data;

    public Tree(int value) {
        left = null;
        right = null;
        data = value;
    }

}