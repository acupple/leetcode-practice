package org.mokey.acupple.practice.linked;

import org.junit.Assert;
import org.junit.Test;
import org.mokey.acupple.practice.models.ListNode;

/**
 * @Author: Forest Yuan
 * @Date: 2019-04-25 15:02
 * @Version 1.0
 */
public class SwapNodesInPairsTest {
    @Test
    public void test() {

        System.out.println(Math.abs(-1));
        ListNode head = ListNode.StringToListNode("1->2->3->4");
        ListNode o = SwapNodesInPairs.swapPairs(head);

        System.out.println(o.toString());
        Assert.assertEquals("2->1->4->3", o.toString());
    }
}
