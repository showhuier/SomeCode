package com.zxh.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by z.xiaohui02 on 2016/11/21.
 */
public class RemoveDuplicatesFromSortedList {
    private class ListNode {
        ListNode next;
        int val;
    }
    public ListNode deleteDuplicates(ListNode head) {//第一次没看到sorted，所以写了个递归
        if(head==null)
            return null;
        Set<Integer> set=new HashSet<Integer>();
        return deleteDuplicates(head,set);
    }
    private ListNode deleteDuplicates(ListNode head,Set<Integer> set){
        if(head==null)
            return null;
        ListNode deletedHead=null;
        if(set.contains(head.val)){
            deletedHead=deleteDuplicates(head.next,set);
        }else{
            set.add(head.val);
            deletedHead=head;
            deletedHead.next=deleteDuplicates(head.next,set);
        }
        return deletedHead;
    }
}
