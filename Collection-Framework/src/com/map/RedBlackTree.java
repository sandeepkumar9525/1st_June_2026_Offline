package com.map;


class Node {
    int data;
    Node left, right;
    boolean red;

    Node(int data) {
        this.data = data;
        this.red = true; // New node is Red
    }
}

public class RedBlackTree {

    Node root;

    void insert(int data) {
        root = insertNode(root, data);
        root.red = false; // Root is always Black
    }

    Node insertNode(Node root, int data) {

        if (root == null) {
            return new Node(data);
        }

        if (data < root.data) {
            root.left = insertNode(root.left, data);
        } else {
            root.right = insertNode(root.right, data);
        }

        // Simple balancing for 10, 20, 30
        if (root.right != null && root.right.red) {
            root = leftRotate(root);
        }

        return root;
    }

    Node leftRotate(Node root) {

        Node newRoot = root.right;
        root.right = newRoot.left;
        newRoot.left = root;

        newRoot.red = root.red;
        root.red = true;

        return newRoot;
    }

    public static void main(String[] args) {

        RedBlackTree tree = new RedBlackTree();

        tree.insert(10);
        tree.insert(20);
        tree.insert(30);

        System.out.println("Root: " + tree.root.data);
    }
}