package org.mokey.acupple.practice.linked;

import org.mokey.acupple.practice.models.ListNode;

/**
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * @Author: Forest Yuan
 * @Date: 2019-04-25 10:55
 * @Version 1.0
 */
public class AddTwoNumbers {
    /**
     * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
     * 输出：7 -> 0 -> 8
     * 原因：342 + 465 = 807
     */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p1 = l1, p2 = l2, curr = dummyHead;
        int carry = 0;
        while (p1 != null || p2 != null){
            int v1 = p1 != null ? p1.val : 0;
            int v2 = p2 != null ? p2.val : 0;
            int sum = v1 + v2;
            if(carry > 0){
                sum += carry;
            }
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;

            if(p1 != null){
                p1 = p1.next;
            }
            if(p2 != null){
                p2 = p2.next;
            }
        }
        if(carry > 0){
            curr.next = new ListNode(carry);
        }

        return dummyHead.next;
    }
}
