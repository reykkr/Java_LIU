public class Main {
    public static void main(String[] args) {
        BST bst = new BST();
        
        bst.root = new TreeNode(5);
        bst.root.left = new TreeNode(3);
        bst.root.left.left = new TreeNode(2);
        bst.root.right = new TreeNode(7);
        bst.root.right.right = new TreeNode(8);

        System.out.println("Is the BST degenerate? " + bst.isDegenerate());
    }
}
