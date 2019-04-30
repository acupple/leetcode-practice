package org.mokey.acupple.practice.linked;

import org.junit.Assert;
import org.junit.Test;
import org.mokey.acupple.practice.models.ListNode;

/**
 * @Author: Forest Yuan
 * @Date: 2019-04-25 20:00
 * @Version 1.0
 */
public class RemoveDuplicatesFromSortedListTest {
    @Test
    public void testRemoveAllDuplicatesRecursion() {
        ListNode head = ListNode.StringToListNode("1->2->3->3->4->4->5");
        ListNode o = RemoveDuplicatesFromSortedList.deleteAllDuplicatesRecursion(head);
        System.out.println(o.toString());
        Assert.assertEquals("1->2->5", o.toString());

        head = ListNode.StringToListNode("1->1->1->2->3");
        o = RemoveDuplicatesFromSortedList.deleteAllDuplicatesRecursion(head);
        System.out.println(o.toString());
        Assert.assertEquals("2->3", o.toString());
    }

    @Test
    public void testRemoveDuplicatesAll() {
        ListNode head = ListNode.StringToListNode("1->2->3->3->4->4->5");
        ListNode o = RemoveDuplicatesFromSortedList.deleteAllDuplicates(head);
        System.out.println(o.toString());
        Assert.assertEquals("1->2->5", o.toString());

        head = ListNode.StringToListNode("1->1->1->2->3");
        o = RemoveDuplicatesFromSortedList.deleteAllDuplicates(head);
        System.out.println(o.toString());
        Assert.assertEquals("2->3", o.toString());
    }

    @Test
    public void testRemoveDuplicatesRecursion() {
        ListNode head = ListNode.StringToListNode("1->2->3->3->4->4->5");
        ListNode o = RemoveDuplicatesFromSortedList.deleteDuplicatesRecursion(head);
        System.out.println(o.toString());
        Assert.assertEquals("1->2->3->4->5", o.toString());

        head = ListNode.StringToListNode("1->1->1->2->3");
        o = RemoveDuplicatesFromSortedList.deleteDuplicatesRecursion(head);
        System.out.println(o.toString());
        Assert.assertEquals("1->2->3", o.toString());
    }

    @Test
    public void testRemoveDuplicates() {
        ListNode head = ListNode.StringToListNode("1->2->3->3->4->4->5");
        ListNode o = RemoveDuplicatesFromSortedList.deleteDuplicates(head);
        System.out.println(o.toString());
        Assert.assertEquals("1->2->3->4->5", o.toString());

        head = ListNode.StringToListNode("1->1->1->2->3");
        o = RemoveDuplicatesFromSortedList.deleteDuplicates(head);
        System.out.println(o.toString());
        Assert.assertEquals("1->2->3", o.toString());
    }

}
