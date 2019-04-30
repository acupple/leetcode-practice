package org.mokey.acupple.practice.linked;

import org.junit.Assert;
import org.junit.Test;
import org.mokey.acupple.practice.models.ListNode;

/**
 * @Author: Forest Yuan
 * @Date: 2019-04-25 11:43
 * @Version 1.0
 */
public class AddTwoNumbersTest {
    @Test
    public void test() {
        ListNode l1 = ListNode.StringToListNode("2 -> 4 -> 3");
        ListNode l2 = ListNode.StringToListNode("5 -> 6 -> 4");

        String expect = "7->0->8";
        ListNode sum = AddTwoNumbers.addTwoNumbers(l1, l2);
        System.out.println(sum);
        Assert.assertEquals(expect, sum.toString());

        l1 = ListNode.StringToListNode("");
        expect = "5->6->4";
        sum = AddTwoNumbers.addTwoNumbers(l1, l2);
        System.out.println(sum);
        Assert.assertEquals(expect, sum.toString());

        expect = "5->6->4";
        sum = AddTwoNumbers.addTwoNumbers(null, l2);
        System.out.println(sum);
        Assert.assertEquals(expect, sum.toString());
    }
}
