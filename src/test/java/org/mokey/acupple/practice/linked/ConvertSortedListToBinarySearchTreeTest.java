package org.mokey.acupple.practice.linked;

import org.junit.Assert;
import org.junit.Test;
import org.mokey.acupple.practice.models.ListNode;
import org.mokey.acupple.practice.models.TreeNode;


/**
 * @Author: Forest Yuan
 * @Date: 2019-04-26 14:54
 * @Version 1.0
 */
public class ConvertSortedListToBinarySearchTreeTest {
    @Test
    public void test(){
        ListNode head = ListNode.StringToListNode("-10->-3->0->5->9");
        TreeNode tree = ConvertSortedListToBinarySearchTree.sortedListToBST(head);
        System.out.println(tree.toString());
        Assert.assertEquals("0,-3,9,-10,null,5,null", tree.toString());

        head = ListNode.StringToListNode("1->2->3->4->5->6->7");
        tree = ConvertSortedListToBinarySearchTree.sortedListToBST(head);
        System.out.println(tree.toString());
        Assert.assertEquals("4,2,6,1,3,5,7", tree.toString());

        head = ListNode.StringToListNode("");
        tree = ConvertSortedListToBinarySearchTree.sortedListToBST(head);
        Assert.assertEquals(null, tree);

        head = ListNode.StringToListNode("2");
        tree = ConvertSortedListToBinarySearchTree.sortedListToBST(head);
        Assert.assertEquals("2", tree.toString());
    }
}
