package offer;

/**
 * Created by z.xiaohui02 on 2016/11/21.
 */
public class MergeSortedLinkedList {
    private static class Node{
        Node next;
        int val;
    }
    public static Node mergeRecursive(Node head1, Node head2){
        if(head1==null)
            return head2;
        if(head2==null)
            return head1;

        Node mergedHead= new Node();
        if(head1.val<head2.val){
            mergedHead=head1;
            mergedHead.next=merge(head1.next,head2);
        }else{
            mergedHead=head2;
            mergedHead.next= merge(head1,head2.next);
        }
        return mergedHead;
    }

    public static Node merge(Node head1, Node head2){
        Node head1Ptr=head1;
        Node head2Ptr=head2;
        Node mergedHead=null;
        if(head1Ptr==null)
            mergedHead=head2;
        if(head2Ptr==null)
            mergedHead=head1;
        Node mergedCurrentPtr=null;
        if(head1Ptr.val<head2Ptr.val){
            mergedCurrentPtr=head1Ptr;
            mergedHead=head1Ptr;
            head1Ptr=head1Ptr.next;
        }else{
            mergedCurrentPtr=head2Ptr;
            mergedHead=head2Ptr;
            head2Ptr=head2Ptr.next;
        }

        while(head1Ptr!=null || head2Ptr!=null){
            if(head1Ptr==null){
                mergedCurrentPtr.next=head2Ptr;
                break;
            }
            if(head2Ptr==null){
                mergedCurrentPtr.next=head1Ptr;
                break;
            }
            if(head1Ptr.val<head2Ptr.val){
                mergedCurrentPtr.next=head1Ptr;
                head1Ptr=head1Ptr.next;
                mergedCurrentPtr=mergedCurrentPtr.next;
            }else{
                mergedCurrentPtr.next=head1Ptr;
                head2Ptr=head2Ptr.next;
                mergedCurrentPtr=mergedCurrentPtr.next;
            }
        }
        return mergedHead;
    }
}
