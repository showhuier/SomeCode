package com.zxh.linked.list;

/**
 * Created by z.xiaohui02 on 2016/11/7.
 */
public class FindCycleInSinglyLinkedList {
    private class Node{
        public Node next;
        public int value;
    }
    public static boolean hasCycle(Node head){
        if (head==null)
            return false;
        Node turtle,rabbit;
        turtle=head;
        rabbit=head;
        while(true){
            turtle=turtle.next;
            if(rabbit.next!=null)
                rabbit=rabbit.next.next;
            else
                return false;
            if(turtle==null || rabbit==null)
                return false;
            if(turtle==rabbit)
                return true;
        }
    }
}
