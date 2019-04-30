package org.mokey.acupple.practice.linked;

import org.junit.Assert;
import org.junit.Test;
import org.mokey.acupple.practice.models.ListNode;

/**
 * @Author: Forest Yuan
 * @Date: 2019-04-26 11:30
 * @Version 1.0
 */
public class ReverseLinkedListIITest {
    @Test
    public void test() {
        ListNode head = ListNode.StringToListNode("1->2->3->4->5");
        ListNode o = ReverseLinkedListII.reverseBetween(head, 2, 4);
        System.out.println(o.toString());
        Assert.assertEquals("1->4->3->2->5", o.toString());
    }
}
