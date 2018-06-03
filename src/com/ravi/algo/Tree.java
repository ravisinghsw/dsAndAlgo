package com.ravi.algo;

/**
 * Created by ravi on 6/20/2017.
 */
public class Tree {

    private Tree left;

    private Tree right;

    private int data;

    public Tree(int num) {
        this.data=num;
        this.left=null;
        this.right=null;
    }



    public void addNode(int num) {

        if(num > data){
            if(right !=null ){
                right.addNode(num);
            }else {
                right = new Tree(num);
            }
        } else if(num < data){
            if(left !=null ){
                left.addNode(num);
            }else {
                left = new Tree(num);
            }
        }

    }


    public void inOrderTraversal(Tree root){

        if(root.left!=null)
            root.inOrderTraversal(root.left);

        System.out.print(root.data+ " ");

        if(root.right!=null)
            root.inOrderTraversal(root.right);
    }

    public void outOrderTraversal(Tree root){

        if(root.right!=null)
            root.outOrderTraversal(root.right);

        System.out.println(root.data);

        if(root.left!=null)
            root.outOrderTraversal(root.left);
    }

    public void preOrderTraversal(Tree root){
        System.out.println(root.data);
        if(root.left!=null)
            root.preOrderTraversal(root.left);
        if(root.right!=null)
            root.preOrderTraversal(root.right);
    }

    public void postOrderTraversal(Tree root){

        if(root.left!=null)
            root.postOrderTraversal(root.left);
        if(root.right!=null)
            root.postOrderTraversal(root.right);

        System.out.println(root.data);
    }

}
