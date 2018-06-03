package com.ravi.geekforgeeks.array.tree;

/**
 * https://www.geeksforgeeks.org/print-nodes-top-view-binary-tree/
 */
public class PrintTopViewOfBinaryTree {

    public static void main(String[] args) {
        /* Create following Binary Tree
             1
           /  \
          2    3
           \
            4
             \
              5
               \
                6*/
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.left.right.right = new Node(5);
        root.left.right.right.right = new Node(6);
        
        printTopView(root);
    }

    private static void printTopView(Node root) {
    }


}
