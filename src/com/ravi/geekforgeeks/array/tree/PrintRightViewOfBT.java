package com.ravi.geekforgeeks.array.tree;

/**
 *https://www.geeksforgeeks.org/print-right-view-binary-tree-2/
 */
public class PrintRightViewOfBT {

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.left.right = new Node(8);

        printRightView(root , 0);
    }

    static int nextLevel = 0;

    private static void printRightView(Node root, int level) {
        if (root==null)
            return;

        if(nextLevel == level) {
            System.out.println(root.data);
            nextLevel++;
        }
        printRightView(root.right, level+1);
        printRightView(root.left, level+1);
    }
}
