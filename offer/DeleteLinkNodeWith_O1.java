package offer;

/**
 * Created by z.xiaohui02 on 2016/11/19.
 */
public class DeleteLinkNodeWith_O1 {
    private class Node {
        public Node next;
        public int value;
    }
    public static void deleteNode(Node head, Node toBeDelete){
        if(head ==null || toBeDelete==null){
            return;
        }
        if(toBeDelete.next!=null){
            toBeDelete.value=toBeDelete.next.value;
            toBeDelete.next=toBeDelete.next.next;
        }else if(head==toBeDelete){     //只有一个头结点
            head=null;
        }else{
            Node newNode= head;
            while(newNode.next!=toBeDelete){
                newNode=newNode.next;
            }
            newNode.next=null;
        }
    }
}
