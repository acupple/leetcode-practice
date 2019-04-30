package org.mokey.acupple.practice.linked;

import org.junit.Assert;
import org.junit.Test;
import org.mokey.acupple.practice.models.ListNode;

/**
 * @Author: Forest Yuan
 * @Date: 2019-04-25 13:44
 * @Version 1.0
 */
public class MergeTwoSortedListsTest {
    @Test
    public void test() {
        ListNode l1 = ListNode.StringToListNode("1->2->4");
        ListNode l2 = ListNode.StringToListNode("1->3->4");

        ListNode o = MergeTwoSortedLists.mergeTwoLists(l1, l2);
        System.out.println(o.toString());
        Assert.assertEquals("1->1->2->3->4->4", o.toString());

        l1 = ListNode.StringToListNode("1->2->4");
        o = MergeTwoSortedLists.mergeTwoLists(l1, null);
        System.out.println(o.toString());
        Assert.assertEquals(l1.toString(), o.toString());

        l1 = ListNode.StringToListNode("1->2->4");
        l2 = ListNode.StringToListNode("7");
        o = MergeTwoSortedLists.mergeTwoLists(l1, l2);
        System.out.println(o.toString());
        Assert.assertEquals("1->2->4->7", o.toString());

    }
}
