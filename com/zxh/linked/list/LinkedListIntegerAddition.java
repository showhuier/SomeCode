package com.zxh.linked.list;

/**
 * Created by z.xiaohui02 on 2016/11/7.
 */
public class LinkedListIntegerAddition {
    private static class Node{
        public Node next;
        public int value;
    }

    public static Node addLinkedListNumbers(Node first, Node second){
        int carry=0;
        Node result=null;
        Node iter=null;
        while(first!=null || second!=null){
            int firstValue=first==null? 0:first.value;
            int secondValue=second==null? 0:second.value;
            int sum=(firstValue+secondValue+carry)%10;
            carry=(firstValue+secondValue+carry)/10;

            Node node =new Node();
            node.value=sum;
            node.next=null;
            if(result==null){
                iter=node;
                result=node;
            }else{
                iter.next=node;
            }
            first=(first==null)? null:first.next;
            second=(second==null)? null:second.next;
        }
        if(carry!=0){
            Node node=new Node();
            node.value=carry;
            node.next=null;
            iter.next=node;
            iter=node;
        }
        return result;
    }

}
