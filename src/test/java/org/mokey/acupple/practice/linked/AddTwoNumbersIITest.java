package org.mokey.acupple.practice.linked;

import org.junit.Assert;
import org.junit.Test;
import org.mokey.acupple.practice.models.ListNode;

/**
 * @Author: Forest Yuan
 * @Date: 2019-04-29 09:47
 * @Version 1.0
 */
public class AddTwoNumbersIITest {
    @Test
    public void test() {
        ListNode l1 = ListNode.StringToListNode("7 -> 2 -> 4 -> 3");
        ListNode l2 = ListNode.StringToListNode("5 -> 6 -> 4");

        ListNode o = AddTwoNumbersII.addTwoNumbers(l1, l2);
        System.out.println(o.toString());
        Assert.assertEquals("7->8->0->7", o.toString());
    }
}
