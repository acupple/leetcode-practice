package org.mokey.acupple.practice.linked;

import org.junit.Assert;
import org.junit.Test;
import org.mokey.acupple.practice.models.ListNode;

/**
 * @Author: Forest Yuan
 * @Date: 2019-04-25 18:35
 * @Version 1.0
 */
public class RotateListTest {
    @Test
    public void test() {
        ListNode head = ListNode.StringToListNode("1->2->3->4->5");
        ListNode o = RotateList.rotateRight(head, 2);
        System.out.println(o.toString());
        Assert.assertEquals("4->5->1->2->3", o.toString());

        head = ListNode.StringToListNode("1->2->3->4->5");
        o = RotateList.rotateRight(head, 1);
        System.out.println(o.toString());
        Assert.assertEquals("5->1->2->3->4", o.toString());

        head = ListNode.StringToListNode("1->2->3->4->5");
        o = RotateList.rotateRight(head, 100);
        System.out.println(o.toString());
        Assert.assertEquals("1->2->3->4->5", o.toString());

        head = ListNode.StringToListNode("1->2->3->4->5");
        o = RotateList.rotateRight(head, 8);
        Assert.assertEquals("3->4->5->1->2", o.toString());
    }
}
