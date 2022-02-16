package com.arena.old;

import java.util.HashMap;

public class Trie {
    private static int ALPHABET_SIZE = 26;
    private class Node {
        private char value;
        private HashMap<Character, Node> children = new HashMap<>();
        private boolean isEndOfWord;

        public void setEndOfWord(boolean endOfWord) {
            isEndOfWord = endOfWord;
        }

        public Node(char value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "value=" + value;
        }

        public boolean hasChild(char ch) {
            return (children.containsKey(ch));
        }

        public void addChild (char ch) {
            children.put(ch, new Node(ch));
        }

        public Node getChild(char ch) {
            return children.get(ch);
        }

        public Node[] getChildren() {
            return children.values().toArray(new Node[0]);
        }

//        public Node[] removeChild() {
//        }

    }

    private Node root = new Node(' ');

    public void insert(String word) {
        Node current = root;
        for (char ch : word.toCharArray()) {
            if (!current.hasChild(ch))
                current.addChild(ch);
            current = current.getChild(ch);
        }
        current.isEndOfWord = true;
    }

    public boolean contains(String word) {
        Node current = root;
        if (null == word) return false;
        for (char ch : word.toCharArray()) {
            if (!current.hasChild(ch))
                return false;
            current = current.getChild(ch);
        }
        return current.isEndOfWord;
    }

    public void traverse() {
        traverse(root);
    }

    private void traverse(Node node) {
        // pre-order visits the root first
        System.out.println(node.value);

        for (Node child : node.getChildren()) {
            traverse(child);
        }
        // post-order visits the root first
        System.out.println(node.value);
    }

    public void remove(String str) {
        for (int i = str.length() - 1; i > 0; i--) {
            if (root.getChild(str.charAt(i)).isEndOfWord)
                root.getChild(str.charAt(i - 1)).setEndOfWord(true);
        }
        // post-order visits the root first
        System.out.println(root.value);
    }

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("canada");
        trie.remove("canada");
    }

}
