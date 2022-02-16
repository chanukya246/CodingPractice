package com.arena.old;

public class TreeEx {

    private class Node {

        private int value;
        private Node leftChild;
        private Node rightChild;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString(){
            return "Node=" + value;
        }

    }

    private Node root;

    public void insert(int value) {
        Node node = new Node(value);

        if (root == null) {
            root = node;
            return;
        }
        Node current = root;

        while (true) {
            if (value < current.value) {
                if (current.leftChild == null) {
                    current.leftChild = node;
                    break;
                }
                current = current.leftChild;
            } else  if (value > current.value) {
                if (current.rightChild == null) {
                    current.rightChild = node;
                    break;
                }
                current = current.rightChild;
            }
        }
    }

    private boolean find(int value) {
        if (value == root.value) return true;
        Node current = root;
        while (current != null) {
            if (value > current.value)
                current = current.rightChild;
             else if (value < current.value)
                current = current.leftChild;
             else
                return true;
        }
        return false;
    }

    public void traversePreOrder() {
        traversePreOrder(root);
    }

    private void traversePreOrder(Node root) {
        if (root == null) return;
        System.out.println(root.value);
        traversePreOrder(root.leftChild);
        traversePreOrder(root.rightChild);
    }

    public void traverseInOrder() {
        traverseInOrder(root);
    }

    private void traverseInOrder(Node root) {
        if (root == null) return;
        traversePreOrder(root.leftChild);
        System.out.println(root.value);
        traversePreOrder(root.rightChild);
    }

    public void traversePostOrder() {
        traversePostOrder(root);
    }

    private void traversePostOrder(Node root) {
        if (root == null) return;
        traversePreOrder(root.leftChild);
        traversePreOrder(root.rightChild);
        System.out.println(root.value);
    }

    public int height() {
        return height(root);
    }

    private int height(Node root) {
        if (root == null) return -1;
        if (hasLeaf(root)) return 0;

        return 1 + Math.max(height(root.leftChild), height(root.rightChild));
    }

    private boolean hasLeaf(Node root) {
        return root.leftChild == null && root.rightChild == null;
    }

    public int min() {
        return min(root);
    }

    private int min(Node root) {
        if (hasLeaf(root)) return root.value;
        int left = min(root.leftChild);
        int right = min(root.rightChild);

        return Math.min(Math.min(left, right), root.value);
    }

    public static void main(String[] args) {
        TreeEx treeEx = new TreeEx();
        treeEx.insert(7);
        treeEx.insert(4);
        treeEx.insert(1);
        treeEx.insert(6);
        treeEx.insert(9);
        treeEx.insert(8);
        treeEx.insert(10);
//        System.out.println("####====traversePreOrder ===>");
//        treeEx.traversePreOrder();
//        System.out.println("####====traverseInOrder ===>");
//        treeEx.traverseInOrder();
//        System.out.println("####====traversePostOrder ===>");
//        treeEx.traversePostOrder();
        System.out.println(treeEx.min());

    }

}
