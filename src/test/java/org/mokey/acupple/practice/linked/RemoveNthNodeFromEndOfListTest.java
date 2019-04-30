package org.mokey.acupple.practice.linked;

import org.junit.Assert;
import org.junit.Test;
import org.mokey.acupple.practice.models.ListNode;

/**
 * @Author: Forest Yuan
 * @Date: 2019-04-25 12:10
 * @Version 1.0
 */
public class RemoveNthNodeFromEndOfListTest {
    @Test
    public void test() {
        ListNode head = ListNode.StringToListNode("1->2->3->4->5");
        ListNode o = RemoveNthNodeFromEndOfList.removeNthFromEnd(head, 2);

        Assert.assertEquals("1->2->3->5", o.toString());
        System.out.println(o.toString());

        head = ListNode.StringToListNode("");
        o = RemoveNthNodeFromEndOfList.removeNthFromEnd(head, 2);
        Assert.assertEquals(null, o);

        head = ListNode.StringToListNode("1->2");
        o = RemoveNthNodeFromEndOfList.removeNthFromEnd(head, 2);
        Assert.assertEquals("2", o.toString());

        o = RemoveNthNodeFromEndOfList.removeNthFromEnd(head, 5);
        Assert.assertEquals(null, o);
    }
}
