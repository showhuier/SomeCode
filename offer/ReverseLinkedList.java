package offer;

import java.util.Stack;

/**
 * Created by z.xiaohui02 on 2016/11/21.
 */
public class ReverseLinkedList {
    private class Node {
        Node next;
        int val;
    }

    public static Node reverseList(Node head) {
        Node previousNode = null;
        Node nextNode = null;
        while (head != null) {
            nextNode = head.next;
            head.next = previousNode;
            previousNode = head;
            head = nextNode;
        }
        return previousNode;
    }

    public static Node recursiveReverse(Node head) { //与使用栈类似
        if (head == null || head.next == null)
            return head;
        Node nextNode = head.next;
        head.next = null;
        Node reversedHead = recursiveReverse(nextNode);
        nextNode.next = head;
        return reversedHead;
    }

    public static Node reverseWithStack(Node head) {//自己写的，还未测试
        Stack<Node> stack = new Stack<Node>();
        while (head != null) {
            stack.push(head);
            head = head.next;
        }
        Node reversedHead = stack.pop();
        head = reversedHead;
        while (!stack.isEmpty()) {
            head.next = stack.pop();
            head = head.next;
        }
        head.next = null;//将最后一个节点的next设为null
        return reversedHead;
    }
}
