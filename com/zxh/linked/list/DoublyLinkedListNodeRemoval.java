package com.zxh.linked.list;

/**
 * Created by z.xiaohui02 on 2016/11/7.
 */
public class DoublyLinkedListNodeRemoval {
    public static void revomeTargetNode(Node head, int target){
        Node current=head;
        while(current!=null){
            if(current.value==target){
                if(current.previous!=null)
                    current.previous.next=current.next;
                if(current.next!=null)
                    current.next.previous=current.previous;
                break;
            }
            current=current.next;
        }
    }

    private class Node{
        public Node next;
        public Node previous;
        public int value;
    }
}
