class BST {
    TreeNode root;

    public boolean isDegenerate(TreeNode node) {
        if (node == null) {
            return true;
        }
        if (node.left != null && node.right != null) {
            return false;
        }
        return isDegenerate(node.left) && isDegenerate(node.right);
    }

    public boolean isDegenerate() {
        return isDegenerate(root);
    }
}
