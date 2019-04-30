package org.mokey.acupple.practice.linked;

import org.junit.Test;
import org.mokey.acupple.practice.models.ListNode;

/**
 * @Author: Forest Yuan
 * @Date: 2019-04-25 13:59
 * @Version 1.0
 */
public class MergeKSortedListsTest {
    @Test
    public void test() {
        ListNode[] lists = new ListNode[3];
        lists[0] = ListNode.StringToListNode("1->4->5");
        lists[1] = ListNode.StringToListNode("1->3->4");
        lists[2] = ListNode.StringToListNode("2->6");

        System.out.println(MergeKSortedLists.mergeKLists(lists));
    }
}
