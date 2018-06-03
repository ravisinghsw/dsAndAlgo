package com.ravi.geekforgeeks.array.tree;

import java.util.*;

public class LevelWiseTraversal {


    public static void main(String[] args) {
        /*            1
                   /     \
                  2       3
                /   \       \
               4     5       6
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        printlevel(root);
       /* printlevelWise1(root,0);

        for(Integer key : map.keySet()){
            System.out.println(map.get(key));
        }*/
    }

    private static void printlevel(Node root){
        if(root==null)
            return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node temp = queue.poll();
            System.out.println(temp.data);
            if(temp.left!=null){
                queue.add(temp.left);
            }
            if(temp.right!=null){
                queue.add(temp.right);
            }
        }
    }
    static Map<Integer,List<Integer>> map = new LinkedHashMap<>();
    private static void printlevelWise1(Node root ,int level) {
        if(root==null)
            return;
        if(map.get(level)!=null){
            map.get(level).add(root.data);
        } else {
            List<Integer> list = new ArrayList<>();
            list.add(root.data);
            map.put(level,list);
        }
        level = level+1;
        printlevelWise1(root.left,level);
        printlevelWise1(root.right,level);

    }
}
