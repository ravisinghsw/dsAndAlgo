package com.ravi.algo;

/**
 * Created by ravi on 6/20/2017.
 */
public class TreeTest {


    public static void main(String[] args) {

        int[] arr = {6,4,8,7,9,3,4,5,1,2};

        Tree root=null;
        boolean bRoot = true;
        for (int num : arr){
            if(bRoot){
                bRoot = false;
                root = new Tree(num);
            } else {
                root.addNode(num);
            }
        }

        root.inOrderTraversal(root);

    }

}
