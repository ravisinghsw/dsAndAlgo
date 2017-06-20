package com.ravi.algo;

/**
 * Created by ravi on 6/20/2017.
 */
public class Tree<I extends  Comparable> {

    public Tree<I> leftNode ;

    public Tree<I> rightNode;

    public Tree parent;

    public I data;

    public Tree(){


    }

    public void inOrderTree(Tree tree) {

    }


    public boolean addNode(I data) {

        if(parent==null) {
            parent = new Tree();
            parent.data = data;
        }else {
            if(data.compareTo(this.data)<0){
                leftNode = new Tree();
                leftNode.addNode(data);
            }else if(data.compareTo(this.data)>0) {
                rightNode = new Tree();
                rightNode.addNode(data);
            }
        }

        return true;
    }
}
