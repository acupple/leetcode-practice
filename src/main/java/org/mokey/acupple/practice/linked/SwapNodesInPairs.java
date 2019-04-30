package org.mokey.acupple.practice.linked;

import org.mokey.acupple.practice.models.ListNode;

/**
 * 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 * @Author: Forest Yuan
 * @Date: 2019-04-25 14:35
 * @Version 1.0
 */
public class SwapNodesInPairs {
    /**
     * 示例:
     * 给定 1->2->3->4, 你应该返回 2->1->4->3.
     */
    public static ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode dummyHead = head.next;
        head.next = swapPairs(dummyHead.next);
        dummyHead.next = head;

        return dummyHead;
    }
}
