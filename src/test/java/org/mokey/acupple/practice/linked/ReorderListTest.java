package org.mokey.acupple.practice.linked;

import org.junit.Test;
import org.mokey.acupple.practice.models.ListNode;

/**
 * @Author: Forest Yuan
 * @Date: 2019-04-28 14:10
 * @Version 1.0
 */
public class ReorderListTest {
    @Test
    public void test() {
        ListNode head = ListNode.StringToListNode("1->2->3->4->5");
        ReorderList.reorderList(head);
        System.out.println(head);
    }

    @Test
    public void test2() {
        ListNode head = ListNode.StringToListNode("1->2->3->4");
        ReorderList.reorderList(head);
        System.out.println(head);
    }
}
