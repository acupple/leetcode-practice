package org.mokey.acupple.practice.linked;

import org.junit.Assert;
import org.junit.Test;
import org.mokey.acupple.practice.models.ListNode;

/**
 * @Author: Forest Yuan
 * @Date: 2019-04-26 11:02
 * @Version 1.0
 */
public class PartitionListTest {
    @Test
    public void test() {
        ListNode head = ListNode.StringToListNode("1->4->3->2->5->2");
        ListNode o = PartitionList.partition(head, 3);
        System.out.println(o.toString());
        Assert.assertEquals("1->2->2->4->3->5", o.toString());
    }
}
