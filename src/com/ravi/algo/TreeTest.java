package com.ravi.algo;

/**
 * Created by ravi on 6/20/2017.
 */
public class TreeTest {


    public static void main(String[] args) {
        Tree<Integer> tree = new Tree<>();

        System.out.println("Jai Mata di !!");


        tree.addNode(5);
        tree.addNode(1);
        tree.addNode(3);
        tree.addNode(5);
        tree.inOrderTree(tree.parent);



    }

}
