package practice.com;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BFS_Test {

    public static void main(String[] args) {
        TreeNode root = buildTree();

        System.out.println("Level Order Traversal:");
        levelOrder(root);
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
        root.right.left.left = new TreeNode(12);
        root.right.left.right = new TreeNode(13);
        root.right.right.left = new TreeNode(14);
        root.right.right.right = new TreeNode(15);

        return root;
    }

    private static void levelOrder(TreeNode root) {
        // base case
        if (root == null) return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        //logic
        while (!queue.isEmpty()) {
            int level = queue.size();
            int[] arr = new int[level];

            for (int i = 0; i < level; i++) {
                TreeNode tempNode = queue.poll();
                arr[i] = tempNode.val;

                if (tempNode.left != null) queue.offer(tempNode.left);
                if (tempNode.right != null) queue.offer(tempNode.right);
            }
            System.out.print(Arrays.toString(arr) + " ");
        }
    }

}
