package org.mokey.acupple.practice.linked;

import org.junit.Assert;
import org.junit.Test;
import org.mokey.acupple.practice.models.ListNode;

/**
 * @Author: Forest Yuan
 * @Date: 2019-04-30 10:28
 * @Version 1.0
 */
public class LinkedListComponentsTest {
    @Test
    public void test() {
        ListNode head = ListNode.StringToListNode("0->1->2->3");
        Assert.assertEquals(2, LinkedListComponents.numComponents(head, new int[]{0, 1, 3}));

        head = ListNode.StringToListNode("0->1->2->3->4");
        Assert.assertEquals(2, LinkedListComponents.numComponents(head, new int[]{0, 3, 1, 4}));

        head = ListNode.StringToListNode("0->1->2->3->4->5->6->7");
        Assert.assertEquals(4, LinkedListComponents.numComponents(head, new int[]{0, 2, 3, 5, 7}));
    }
}
