package org.mokey.acupple.practice.linked;

import org.junit.Assert;
import org.junit.Test;
import org.mokey.acupple.practice.models.ListNode;

/**
 * @Author: Forest Yuan
 * @Date: 2019-04-28 17:44
 * @Version 1.0
 */
public class OddEvenLinkedListTest {
    @Test
    public void test() {
        ListNode head = ListNode.StringToListNode("1->2->3->4");
        OddEvenLinkedList.oddEvenList(head);
        System.out.println(head);
        Assert.assertEquals("1->3->2->4", head.toString());

        head = ListNode.StringToListNode("1->2->3->4->5");
        OddEvenLinkedList.oddEvenList(head);
        System.out.println(head);
        Assert.assertEquals("1->3->5->2->4", head.toString());
    }
}
