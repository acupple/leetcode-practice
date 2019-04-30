package org.mokey.acupple.practice.linked;

import org.mokey.acupple.practice.models.ListNode;

/**
 * 给定一个排序链表，删除所有含有重复数字的节点，只保留原始链表中 没有重复出现 的数字。
 * @Author: Forest Yuan
 * @Date: 2019-04-25 18:40
 * @Version 1.0
 */
public class RemoveDuplicatesFromSortedList {

    /**
     * 递归实现
     * 示例 1:
     * 输入: 1->2->3->3->4->4->5
     * 输出: 1->2->5
     *
     * 示例 2:
     * 输入: 1->1->1->2->3
     * 输出: 2->3
     */
    public static ListNode deleteAllDuplicatesRecursion(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        if(head.val == head.next.val){
            while(head.next != null && head.val == head.next.val)
                head = head.next;
            if(head.next == null){
                return null;
            }
            head = head.next;
            return deleteAllDuplicatesRecursion(head);
        }
        head.next = deleteAllDuplicatesRecursion(head.next);

        return head;
    }

    /**
     * 普通遍历实现
     * 示例 1:
     * 输入: 1->2->3->3->4->4->5
     * 输出: 1->2->5
     *
     * 示例 2:
     * 输入: 1->1->1->2->3
     * 输出: 2->3
     */
    public static ListNode deleteAllDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;

        ListNode prev = dummyHead, cur = dummyHead.next;
        while (cur != null){
            while (cur.next != null && cur.val == cur.next.val){
                cur = cur.next;
            }
            if(prev.next == cur){
                prev = prev.next;
            } else {
                prev.next = cur.next;
            }

            cur = cur.next;
        }

        return dummyHead.next;
    }

    /**
     * 普通遍历实现
     * 示例 1:
     * 输入: 1->2->3->3->4->4->5
     * 输出: 1->2->3->4->5
     *
     * 示例 2:
     * 输入: 1->1->1->2->3
     * 输出: 1->2->3
     */
    public static ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode prev = head, curr = head.next;
        while (curr != null){
            if(curr.val != prev.val){
                prev = prev.next;
            }
            curr = curr.next;
            prev.next = curr;
        }

        return head;
    }

    /**
     * 递归实现
     * 示例 1:
     * 输入: 1->2->3->3->4->4->5
     * 输出: 1->2->3->4->5
     *
     * 示例 2:
     * 输入: 1->1->1->2->3
     * 输出: 1->2->3
     */
    public static ListNode deleteDuplicatesRecursion(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        head.next = deleteDuplicatesRecursion(head.next);
        if(head.val == head.next.val){
            head = head.next;
        }
        return head;
    }
}
