package practice.com;

public class DFS_Test {

    public static void main(String[] args) {
        TreeNode root = buildTree();

        System.out.println("Inorder Traversal:");
        inOrder(root);   // Expected: 8 4 9 2 10 5 11 1 6 3 12 7

        System.out.println("\nPreorder Traversal:");
        preOrder(root);  // Expected: 1 2 4 8 9 5 10 11 3 6 7 12

        System.out.println("\nPostorder Traversal:");
        postOrder(root); // Expected: 8 9 4 10 11 5 2 6 12 7 3 1
    }

    // Constructing the same 12-node tree we discussed
    private static TreeNode buildTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        root.left.left.left = new TreeNode(8);
        root.left.left.right = new TreeNode(9);
        root.left.right.left = new TreeNode(10);
        root.left.right.right = new TreeNode(11);
        root.right.right.left = new TreeNode(12);

        return root;
    }

    private static void preOrder(TreeNode root) {
        // base case
        if (root == null) return;

        // logic
        System.out.print( " " +root.val);
        preOrder(root.left);
        preOrder(root.right);
    }

    private static void inOrder(TreeNode root) {
        // base case
        if (root == null) return;

        // logic
        inOrder(root.left);
        System.out.print( " " +root.val);
        inOrder(root.right);

    }

    private static void postOrder(TreeNode root) {
        // base case
        if (root == null) return;

        // logic
        postOrder(root.left);
        postOrder(root.right);
        System.out.print( " " +root.val);
    }

}



//public class TreeNode {
//
//    int val;
//    TreeNode left;
//    TreeNode right;
//
//    public TreeNode(int i) {
//        this.val = i;
//    }
//
//}