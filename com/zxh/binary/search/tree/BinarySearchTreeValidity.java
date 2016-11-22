package com.zxh.binary.search.tree;

/**
 * Created by z.xiaohui02 on 2016/11/7.
 */
public class BinarySearchTreeValidity {
    private class Node{
        public Node left;
        public Node right;
        int value;
    }
    public static boolean isValidBST(Node root){
        return isValidBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    private static boolean isValidBST(Node current, int min, int max){
        if(current.right!=null){
            if(current.right.value>max ||
                    !isValidBST(current.right,current.value,max))
                return false;
        }
        if(current.left!=null){
            if(current.left.value<min ||
                    !isValidBST(current.left,min,current.value))
                return false;
        }
        return true;
    }
}
