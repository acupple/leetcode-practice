package org.mokey.acupple.practice.linked;

import org.junit.Test;
import org.mokey.acupple.practice.models.ListNode;

/**
 * @Author: Forest Yuan
 * @Date: 2019-04-25 15:24
 * @Version 1.0
 */
public class ReverseNodesInKGroupTest {
    @Test
    public void test() {
        ListNode head = ListNode.StringToListNode("1->2->3->4->5");
        ListNode o = ReverseNodesInKGroup.reverseKGroup(head, 3);

        System.out.println(o.toString());
    }
}
