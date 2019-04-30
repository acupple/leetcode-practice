package org.mokey.acupple.practice.linked;

import org.mokey.acupple.practice.models.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个单链表 L：L0→L1→…→Ln-1→Ln ，
 * 将其重新排列后变为： L0→Ln→L1→Ln-1→L2→Ln-2→…
 * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换
 * @Author: Forest Yuan
 * @Date: 2019-04-28 13:36
 * @Version 1.0
 */
public class ReorderList {
    /**
     * 示例 1:
     * 给定链表 1->2->3->4, 重新排列为 1->4->2->3.
     *
     * 示例 2:
     * 给定链表 1->2->3->4->5, 重新排列为 1->5->2->4->3.
     */
    public static void reorderList(ListNode head) {
        if(head == null){
            return;
        }
        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println(slow.val);
        ListNode after = slow.next;
        slow.next = null;

        ListNode prev = null, pNext;
        while (after != null){
            pNext = after.next;
            after.next = prev;
            prev = after;
            after = pNext;
        }

        System.out.println(prev.val);
        ListNode curr = head, p1, p2;
        while (curr != null && prev != null){
            p1 = curr.next;
            p2 = prev.next;

            curr.next = prev;
            prev.next = p1;

            curr = p1;
            prev = p2;
        }
    }
}
