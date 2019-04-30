package org.mokey.acupple.practice.linked;

import org.mokey.acupple.practice.models.ListNode;

/**
 * @Author: Forest Yuan
 * @Date: 2019-04-28 17:32
 * @Version 1.0
 */
public class OddEvenLinkedList {
    public static ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode a = head, bHead = head.next, b = bHead;

        while (a.next != null){
            a.next = a.next.next;
            if(a.next != null){
                a = a.next;
                b.next = a.next;
                b = b.next;
            }
        }

        a.next = bHead;

        return head;
    }
}
