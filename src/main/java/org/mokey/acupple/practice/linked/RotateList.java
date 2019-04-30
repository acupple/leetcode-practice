package org.mokey.acupple.practice.linked;

import org.mokey.acupple.practice.models.ListNode;

/** 给定一个链表，旋转链表，将链表每个节点向右移动 k 个位置，其中 k 是非负数。
 * @Author: Forest Yuan
 * @Date: 2019-04-25 17:46
 * @Version 1.0
 */
public class RotateList {
    /**
     * 示例 1:
     *
     * 输入: 1->2->3->4->5->NULL, k = 2
     * 输出: 4->5->1->2->3->NULL
     * 解释:
     * 向右旋转 1 步: 5->1->2->3->4->NULL
     * 向右旋转 2 步: 4->5->1->2->3->NULL
     * 示例 2:
     *
     * 输入: 0->1->2->NULL, k = 4
     * 输出: 2->0->1->NULL
     * 解释:
     * 向右旋转 1 步: 2->0->1->NULL
     * 向右旋转 2 步: 1->2->0->NULL
     * 向右旋转 3 步: 0->1->2->NULL
     * 向右旋转 4 步: 2->0->1->NULL
     */
    public static ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0){
            return head;
        }

        ListNode tail = head, nKNode = head;
        int length = 1;
        for (; tail.next != null ; length++) {
            tail = tail.next;
        }

        for (int j = 0; j < length - k % length - 1; j++) {
            nKNode = nKNode.next;
        }

        tail.next = head;
        ListNode newHead = nKNode.next;
        nKNode.next = null;

        return newHead;

    }
}
