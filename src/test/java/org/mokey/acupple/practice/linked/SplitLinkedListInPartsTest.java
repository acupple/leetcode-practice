package org.mokey.acupple.practice.linked;

import org.junit.Assert;
import org.junit.Test;
import org.mokey.acupple.practice.models.ListNode;

/**
 * @Author: Forest Yuan
 * @Date: 2019-04-30 10:10
 * @Version 1.0
 */
public class SplitLinkedListInPartsTest {
    @Test
    public void test() {
        ListNode root = ListNode.StringToListNode("1->2->3->4");
        ListNode[] ans = SplitLinkedListInParts.splitListToParts(root, 5);
        Assert.assertEquals(5, ans.length);

        ans = SplitLinkedListInParts.splitListToParts(root, 2);
        Assert.assertEquals(2, ans.length);
    }
}
