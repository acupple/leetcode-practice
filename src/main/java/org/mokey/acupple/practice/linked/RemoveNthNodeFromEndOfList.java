package org.mokey.acupple.practice.linked;

import org.mokey.acupple.practice.models.ListNode;

/**
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 * @Author: Forest Yuan
 * @Date: 2019-04-25 11:58
 * @Version 1.0
 */
public class RemoveNthNodeFromEndOfList {

    /**
     * 示例：
     * 给定一个链表: 1->2->3->4->5, 和 n = 2.
     * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
     */
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || n < 0){
            return head;
        }

        ListNode fast = head;
        int i = 0;
        for (; i < n && fast != null; i++) {
            fast = fast.next;
        }

        if(fast == null && i < n -1){
            return null;
        }

        ListNode slow = head;
        ListNode prev = head;
        while (fast != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next;
        }

        //slow is need to be removed
        if(slow == head){
            head = head.next;
        } else {
            prev.next = slow.next;
        }

        return head;
    }
}
