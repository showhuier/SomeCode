package com.zxh.binary.search.tree;

/**
 * Created by z.xiaohui02 on 2016/11/7.
 */
public class LeastCommonAncestor {
    private class Node{
        public Node left;
        public Node right;
        public int value;
    }
    public static Node findLowestCommonAncestor(Node node, int value1,
                                                int value2){
        if(node==null)
            return null;
        if(node.value>value1 && node.value>value2)
            return findLowestCommonAncestor(node.left, value1,value2);
        else
            if(node.value<value1 && node.value<value2)
                return findLowestCommonAncestor(node.right,value1,value2);
        else
            return node;
    }
}
