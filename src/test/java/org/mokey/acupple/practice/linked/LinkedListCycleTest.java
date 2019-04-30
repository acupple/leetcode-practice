package org.mokey.acupple.practice.linked;

import org.junit.Assert;
import org.junit.Test;
import org.mokey.acupple.practice.models.ListNode;

/**
 * @Author: Forest Yuan
 * @Date: 2019-04-28 11:24
 * @Version 1.0
 */
public class LinkedListCycleTest {
    @Test
    public void test() {
        ListNode head = ListNode.StringToListNode("3->2->0->-4");
        head = cycleList(head, 1);
        Assert.assertTrue(LinkedListCycle.hasCycle(head));

        head = ListNode.StringToListNode("1->2");
        head = cycleList(head, 0);
        Assert.assertTrue(LinkedListCycle.hasCycle(head));

        head = ListNode.StringToListNode("1");
        head = cycleList(head, -1);
        Assert.assertFalse(LinkedListCycle.hasCycle(head));
    }

    @Test
    public void test2() {
        ListNode head = ListNode.StringToListNode("3->2->0->-4");
        head = cycleList(head, 1);
        Assert.assertEquals(2, LinkedListCycle.hasCycle2(head).val);
    }

    @Test
    public void test3() {
        ListNode head = ListNode.StringToListNode("3->2->0->-4");
        head = cycleList(head, 1);
        Assert.assertEquals(2, LinkedListCycle.hasCycle3(head).val);
    }

    private ListNode cycleList(ListNode head, int i){
        if(i < 0 ){
            return head;
        }
        ListNode iNode = null;
        ListNode curr = head;
        ListNode tail = head;
        int index = 0;
        while (curr != null){
            if(index == i){
                iNode = curr;
            }
            tail = curr;
            curr = curr.next;
            index ++;
        }
        if(tail != null) {
            tail.next = iNode;
        }
        return head;
    }
}
