package org.mokey.acupple.practice.linked;

import org.mokey.acupple.practice.models.ListNode;

/**
 * @Author: Forest Yuan
 * @Date: 2019-04-28 15:03
 * @Version 1.0
 */
public class ReverseList {
    public static ListNode reverseList(ListNode head){
       ListNode curr = head;
       ListNode dummyHead = null, pNext;
       while (curr != null){
           pNext = curr.next;
           curr.next = dummyHead;

           dummyHead = curr;
           curr = pNext;
       }

       return dummyHead;
    }
}
