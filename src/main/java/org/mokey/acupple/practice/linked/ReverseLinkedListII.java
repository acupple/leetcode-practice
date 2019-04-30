package org.mokey.acupple.practice.linked;

import org.mokey.acupple.practice.models.ListNode;

/**
 * 反转从位置 m 到 n 的链表。请使用一趟扫描完成反转。
 * 说明: 1 ≤ m ≤ n ≤ 链表长度。
 * @Author: Forest Yuan
 * @Date: 2019-04-26 11:08
 * @Version 1.0
 */
public class ReverseLinkedListII {
    /**
     * 示例:
     * 输入: 1->2->3->4->5->NULL, m = 2, n = 4
     * 输出: 1->4->3->2->5->NULL
     */
    public static ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;

        ListNode mNode = dummyHead;
        for (int i = 0; i < m - 1 && mNode.next != null; i++) {
            mNode = mNode.next;
        }

        mNode.next = reverseTopK(mNode.next, n - m + 1);
        return dummyHead.next;
    }

    private static ListNode reverseTopK(ListNode head, int k){
        if(head == null || head.next == null || k == 1){
            return head;
        }

        ListNode prev = null;

        //下一个子链表的头指针
        ListNode pNext = null;

        //翻转后第一个是最后一个节点
        ListNode tail = head;
        for (int i = 0; i < k && head != null; i++) {
            pNext = head.next;
            head.next = prev;
            prev = head;
            head = pNext;
        }
        tail.next = pNext;
        return prev;
    }
}
