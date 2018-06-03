package com.ravi.geekforgeeks.array.tree;

/**
 * https://algorithms.tutorialhorizon.com/print-left-view-of-a-given-binary-tree/
 * https://www.geeksforgeeks.org/print-left-view-binary-tree/
 */
public class PrintLeftViewOfBT {

    private  Node root;

    public static void main(String[] args) {
        PrintLeftViewOfBT tree = new PrintLeftViewOfBT();
        Node root = new Node(5);
        root.left = new Node(10);
        root.right = new Node(15);
        root.left.left = new Node(20);
        root.left.right = new Node(25);
        root.right.left = new Node(30);
        root.right.right = new Node(35);
        root.left.right.right = new Node(45);
        root.left.right.right.left = new Node(2);
        tree.leftView(root ,0);

        System.out.println("*******************************************");
        tree.root = new Node(12);
        tree.root.left = new Node(10);
        tree.root.right = new Node(30);
        tree.root.right.left = new Node(25);
        tree.root.right.right = new Node(40);

        tree.currentLevel = 0;
        tree.leftView(tree.root ,0);
    }
    int currentLevel = 0;

    private void leftView(Node root , int nextlevel) {
        if (root==null)
            return;

        if(currentLevel == nextlevel) {
            System.out.println(root.data);
            currentLevel ++;

        }
        leftView(root.left , nextlevel+1);
        leftView(root.right , nextlevel+1);




    }
}
