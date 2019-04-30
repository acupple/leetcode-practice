package org.mokey.acupple.practice.linked;

import org.mokey.acupple.practice.models.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个链表（链表结点包含一个整型值）的头结点 head。
 * 同时给定列表 G，该列表是上述链表中整型值的一个子集。
 * 返回列表 G 中组件的个数.
 * 这里对组件的定义为：链表中一段最长连续结点的值（该值必须在列表 G 中）构成的集合。
 * @Author: Forest Yuan
 * @Date: 2019-04-30 10:21
 * @Version 1.0
 */
public class LinkedListComponents {
    /**
     * 输入:
     * head: 0->1->2->3
     * G = [0, 1, 3]
     * 输出: 2
     * 解释:
     * 链表中,0 和 1 是相连接的，且 G 中不包含 2，所以 [0, 1] 是 G 的一个组件，
     * 同理 [3] 也是一个组件，故返回 2。
     */
    public static int numComponents(ListNode head, int[] G) {
        Set<Integer> ans = new HashSet<>();
        for(int n : G) ans.add(n);

        int an = 0;
        ListNode curr = head;
        while (curr != null){
            if(ans.contains(curr.val) &&
                    (curr.next == null || !ans.contains(curr.next.val))){
                an ++;
            }
            curr = curr.next;
        }

        return an;
    }
}
