package com.zxh.binary.search.tree;

import javax.xml.soap.Node;
import java.util.Stack;

/**
 * Created by z.xiaohui02 on 2016/11/15.
 */
public class BinTree {
    private class Node {
        public Node left;
        public Node right;
        public int value;
    }

    public static void preOrder(Node root) {
        if (root == null)
            return;

        System.out.print(root.value);
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(Node root) {
        if (root == null)
            return;

        inOrder(root.left);
        System.out.print(root.value);
        inOrder(root.right);
    }

    public static void postOrder(Node root) {
        if (root == null)
            return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.value);
    }

    public static void preOrder2(Node root) {
        Stack<Node> s = new Stack<Node>();
        while (root != null || s.size() != 0) {
            while (root != null) {
                System.out.print(root.value);
                s.push(root);
                root = root.left;
            }
            if (!s.isEmpty()) {
                root = s.pop();
                root = root.right;
            }
        }
    }

    public static void inOrder2(Node root) {
        Stack<Node> s = new Stack<Node>();
        while (root != null || s.size() != 0) {
            while (root != null) {
                s.push(root);
                root = root.left;
            }
            if (!s.isEmpty()) {
                root = s.pop();
                System.out.print(root.value);
                root = root.right;
            }
        }
    }

    public static void postOrder2(Node root) {
        Stack<Node> s = new Stack<Node>();
        Node prev = root;
        while (root != null || s.size() > 0) {
            while (root != null) {
                s.push(root);
                root = root.left;
            }
            if (!s.isEmpty()) {
                Node temp = s.peek().right;
                if (temp == null || temp ==prev){
                    root=s.pop();
                    System.out.print(root.value);
                    prev=root;
                    root=null;
                }else{
                    root=temp;
                }
            }
        }
    }
}
