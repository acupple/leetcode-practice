package org.mokey.acupple.practice.linked;

import org.junit.Assert;
import org.junit.Test;
import org.mokey.acupple.practice.models.ListNode;

/**
 * @Author: Forest Yuan
 * @Date: 2019-04-28 15:13
 * @Version 1.0
 */
public class ReverseListTest {
    @Test
    public void test() {
        ListNode head = ListNode.StringToListNode("1->2->3->4");
        ListNode o = ReverseList.reverseList(head);

        System.out.println(o.toString());
        Assert.assertEquals("4->3->2->1", o.toString());
    }
}
