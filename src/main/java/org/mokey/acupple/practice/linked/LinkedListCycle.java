package org.mokey.acupple.practice.linked;

import org.mokey.acupple.practice.models.ListNode;

/**
 * 给定一个链表，判断链表中是否有环。
 * 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。
 * 如果 pos 是 -1，则在该链表中没有环。
 * @Author: Forest Yuan
 * @Date: 2019-04-28 11:24
 * @Version 1.0
 */
public class LinkedListCycle {
    public static boolean hasCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while(slow != null && fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                return true;
            }

        }
        return false;
    }

    /**
     * 给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
     */
    public static ListNode hasCycle2(ListNode head) {
        // 步骤一：使用快慢指针判断链表是否有环
        boolean hasCycle = false;
        ListNode slow = head, fast = head;
        while(slow != null && fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                hasCycle = true;
                break;
            }

        }

        // 步骤二：若有环，找到入环开始的节点
        // 从头结点开始，当slow和curr相遇的时候，为入环的第一个结点
        if (hasCycle) {
            ListNode curr = head;
            while (slow != curr) {
                curr = curr.next;
                slow = slow.next;
            }
            return curr;
        } else
            return null;
    }

    public static ListNode hasCycle3(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return fast;
            }
        }
        return null;
    }
}
