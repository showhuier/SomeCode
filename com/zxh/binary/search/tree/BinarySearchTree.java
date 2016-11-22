package com.zxh.binary.search.tree;

/**
 * Created by z.xiaohui02 on 2016/11/7.
 */
public class BinarySearchTree {
    private class Node{
        public Node left;
        public Node right;
        public int value;
    }
    public static void insert(Node head, Node newNode){
        if(newNode.value<head.value){
            if(head.left==null)
                head.left=newNode;
            else
                insert(head.left,newNode);
        }else{
            if(head.right==null)
                head.right=newNode;
            else
                insert(head.right,newNode);
        }
    }
}
