package org.mokey.acupple.practice.linked;

import org.mokey.acupple.practice.models.ListNode;

/**
 * @Author: Forest Yuan
 * @Date: 2019-04-28 16:33
 * @Version 1.0
 */
public class SortList {
    public static ListNode sortList(ListNode head) {
        return mergeSort(head);
    }

    private static ListNode mergeSort(ListNode node){
        if(node == null || node.next == null){
            return node;
        }
        ListNode slow = node, fast = node, breakN = node;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            breakN = slow;
            slow = slow.next;
        }
        breakN.next = null;
        ListNode l1 = mergeSort(node);
        ListNode l2 = mergeSort(slow);
        return merge(l1, l2);
    }

    private static ListNode merge(ListNode l1, ListNode l2){
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        if(l1.val <= l2.val){
            l1.next = merge(l1.next, l2);
            return l1;
        } else {
            l2.next = merge(l2.next, l1);
            return l2;
        }
    }
}
