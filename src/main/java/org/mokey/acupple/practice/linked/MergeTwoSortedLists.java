package org.mokey.acupple.practice.linked;

import org.mokey.acupple.practice.models.ListNode;

/**
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * @Author: Forest Yuan
 * @Date: 2019-04-25 13:36
 * @Version 1.0
 */
public class MergeTwoSortedLists {
    /**
     * 示例：
     * 输入：1->2->4, 1->3->4
     * 输出：1->1->2->3->4->4
     */
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(-1);
        ListNode p1 = l1, p2 = l2, cur = dummyHead;
        while (p1 != null && p2 != null){
            if(p1.val < p2.val){
                cur.next = p1;
                cur = p1;
                p1 = p1.next;
            } else {
                cur.next = p2;
                cur = p2;
                p2 = p2.next;
            }
        }
        cur.next = p1 != null ? p1 : p2;
        return dummyHead.next;
    }
}
