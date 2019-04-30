package org.mokey.acupple.practice.linked;

import org.mokey.acupple.practice.models.ListNode;

/**
 * 给定一个头结点为 root 的链表, 编写一个函数以将链表分隔为 k 个连续的部分。
 * 每部分的长度应该尽可能的相等: 任意两部分的长度差距不能超过 1，也就是说可能有些部分为 null。
 * 这k个部分应该按照在链表中出现的顺序进行输出，并且排在前面的部分的长度应该大于或等于后面的长度。
 * 返回一个符合上述规则的链表的列表。
 * @Author: Forest Yuan
 * @Date: 2019-04-30 10:04
 * @Version 1.0
 */
public class SplitLinkedListInParts {
    /**
     * 举例： 1->2->3->4, k = 5 // 5 结果 [ [1], [2], [3], [4], null ]
     */
    public static ListNode[] splitListToParts(ListNode root, int k) {
        ListNode curr = root;
        int N = 0;
        while (curr != null){
            N ++;
            curr = curr.next;
        }

        ListNode[] ans = new ListNode[k];
        curr = root;
        int width = N / k, rem = N % k;
        for (int i = 0; i < k; i++) {
            ListNode head = curr;
            for (int j = 0; j < width + (i < rem ? 1 : 0) - 1; j++) {
                if(curr != null){
                    curr = curr.next;
                }
            }
            if(curr != null){ //前移一个节点
                ListNode prev = curr;
                curr = curr.next;
                prev.next = null;
            }
            ans[i] = head;
        }

        return ans;
    }
}
