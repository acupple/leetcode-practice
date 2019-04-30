package org.mokey.acupple.practice.linked;

import org.mokey.acupple.practice.models.ListNode;
import org.mokey.acupple.practice.models.TreeNode;

/**
 * 给定一个单链表，其中的元素按升序排序，将其转换为高度平衡的二叉搜索树。
 * 本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。
 * @Author: Forest Yuan
 * @Date: 2019-04-26 14:24
 * @Version 1.0
 */
public class ConvertSortedListToBinarySearchTree {

    /**
     * 示例:
     * 给定的有序链表： [-10, -3, 0, 5, 9],
     * 一个可能的答案是：[0, -3, 9, -10, null, 5]
     * 它可以表示下面这个高度平衡二叉搜索树：
     *       0
     *      / \
     *    -3   9
     *    /   /
     *  -10  5
     */
    public static TreeNode sortedListToBST(ListNode head) {
        if(head == null){
            return null;
        }
        if(head.next == null){
            return new TreeNode(head.val);
        }

        if(head.next.next == null){
            TreeNode root = new TreeNode(head.next.val);
            root.left = new TreeNode(head.val);
            return root;
        }

        ListNode p1 = null, p2 = null;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            if(fast != null) {
                p1 = slow;
                slow = slow.next;
            }
            p2 = slow.next;
        }

        p1.next = null;

        TreeNode root = new TreeNode(slow.val);
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(p2);

        return root;
    }
}
