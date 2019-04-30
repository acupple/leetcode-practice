package org.mokey.acupple.practice.linked;

import org.mokey.acupple.practice.models.ListNode;

/**
 * 给出一个链表，每 k 个节点一组进行翻转，并返回翻转后的链表。
 * k 是一个正整数，它的值小于或等于链表的长度。如果节点总数不是 k 的整数倍，那么将最后剩余节点保持原有顺序。
 * @Author: Forest Yuan
 * @Date: 2019-04-25 15:08
 * @Version 1.0
 */
public class ReverseNodesInKGroup {
    /**
     * 示例 :
     * 给定这个链表：1->2->3->4->5
     * 当 k = 2 时，应当返回: 2->1->4->3->5
     * 当 k = 3 时，应当返回: 3->2->1->4->5
     */
    public static ListNode reverseKGroup(ListNode head, int k) {
        // 依然是递归，写一个反转链表的函数
        if(head == null)
            return null;

        ListNode pNext = head;
        for(int i = 0; i < k - 1; i++){
            pNext = pNext.next;
            // 当前链表没有K个结点
            if(pNext == null)
                return head;
        }


        ListNode nextHead = pNext.next;

        ListNode[] nodes = revLink(head, k);
        ListNode leftHead = nodes[0];
        ListNode leftTail = nodes[1];
        leftTail.next = reverseKGroup(nextHead, k);

        return leftHead;
    }

    /**
     * 翻转前k个节点，返回新链表的头和尾
     */
    private static ListNode[] revLink(ListNode head, int k){
        ListNode prev = null;
        ListNode pNext;
        ListNode tail = head;
        for (int i = 0; i < k; i++) {
            pNext = head.next;
            head.next = prev;
            prev = head;
            head = pNext;
        }

        return new ListNode[]{prev, tail};
    }
}
