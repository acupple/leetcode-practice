package org.mokey.acupple.practice.linked;

import org.mokey.acupple.practice.models.ListNode;

/**
 * 合并 k 个排序链表，返回合并后的排序链表
 * @Author: Forest Yuan
 * @Date: 2019-04-25 13:52
 * @Version 1.0
 */
public class MergeKSortedLists {
    /**
     * 输入:
     * [
     *   1->4->5,
     *   1->3->4,
     *   2->6
     * ]
     * 输出: 1->1->2->3->4->4->5->6
     */
    public static ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0){
            return null;
        }

        if(lists.length == 1){
            return lists[0];
        }

        if(lists.length == 2){
            return MergeTwoSortedLists.mergeTwoLists(lists[0], lists[1]);
        }

        int mid = lists.length / 2;
        ListNode[] left = new ListNode[mid];
        for (int i = 0; i < mid; i++) {
            left[i] = lists[i];
        }
        ListNode[] right = new ListNode[lists.length - mid];
        for (int i = mid, j = 0; i < lists.length; i++, j ++) {
            right[j] = lists[i];
        }

        return MergeTwoSortedLists.mergeTwoLists(mergeKLists(left), mergeKLists(right));
    }
}
