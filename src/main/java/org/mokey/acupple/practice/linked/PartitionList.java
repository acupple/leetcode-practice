package org.mokey.acupple.practice.linked;

import org.mokey.acupple.practice.models.ListNode;

/**
 * 给定一个链表和一个特定值 x，对链表进行分隔，使得所有小于 x 的节点都在大于或等于 x 的节点之前。
 * @Author: Forest Yuan
 * @Date: 2019-04-26 10:43
 * @Version 1.0
 */
public class PartitionList {
    /**
     * 示例:
     * 输入: head = 1->4->3->2->5->2, x = 3
     * 输出: 1->2->2->4->3->5
     * 注意: 题目是所有小于 x 的节点都在大于或等于 x 的节点之前
     * 如果改成小于 x 的节点在 x 之前，大于 x 的节点在 x 之后，则结果应该是: 1->2->2->3->4->5
     */
    public static ListNode partition(ListNode head, int x) {
        ListNode beforeHead = new ListNode(0);
        ListNode before = beforeHead;
        ListNode afterHead = new ListNode(0);
        ListNode after = afterHead;
        while (head != null){
            if(head.val < x){
                before.next = head;
                before = before.next;
            } else {
                after.next = head;
                after = after.next;
            }
            head = head.next;
        }
        after.next = null;
        before.next = afterHead.next;
        return beforeHead.next;
    }
}
